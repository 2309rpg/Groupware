package kh.gw.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.gw.dto.ApprovalDTO;
import kh.gw.dto.Approval_signDTO;
import kh.gw.dto.Approval_sign_typeDTO;
import kh.gw.dto.BreakDTO;
import kh.gw.dto.Break_typeDTO;
import kh.gw.dto.DepartmentDTO;
import kh.gw.dto.MemberDTO;
import kh.gw.service.ApprovalService;
import kh.gw.service.BreakService;
import kh.gw.service.MemberService;

@Controller
@RequestMapping("/approval")
public class ApprovalController {
	@Autowired
	private ApprovalService aservice;
	@Autowired
	private MemberService mservice;
	@Autowired
	private BreakService bservice;
	
	@RequestMapping("/toAppMainView.approval")
	public String toAppMainView () {
		aservice.resetConfig();
		return "approval/appMainView";
	}
	
	@RequestMapping("/toAppWriteView.approval")
	public String toAppWriteView (Model model) throws Exception {
		//전자문서 종류 가져오기
		model.addAttribute("docsType", aservice.allDocsType());
		//결재선 선택용 자료 보내기
		List<MemberDTO> mlist = mservice.listMem();//멤버를 불러옴
		List<DepartmentDTO> dlist = mservice.listDept(); //부서명 가져옴
		List<Approval_sign_typeDTO> adtList = aservice.allSignType();
		List<Break_typeDTO> btList = bservice.getAllType();
		model.addAttribute("mlist", mlist);
		model.addAttribute("dlist", dlist);
		model.addAttribute("adtList", adtList);
		model.addAttribute("breakType", btList);
		return "approval/appWriteView";
	}
	
	@RequestMapping("/writeApproval.approval")
	public String writeApproval (ApprovalDTO dto, Approval_signDTO approval_signDTOList, Model model, BreakDTO bdto) throws Exception {	
		int appSeq = aservice.writeApp(dto);
		if(dto.getApp_type_code()==3) {
			bservice.insertBreak(bdto,dto);
		}
		aservice.setInitAppSign(approval_signDTOList, appSeq);
		return this.toAppWriteView(model);
	}
	
	@RequestMapping("/toMySignListView.approval")
	public String toMySignListView (Model model, int cPage) {
		model.addAttribute("signedList", aservice.getMySignedList(cPage));
		model.addAttribute("toBeSignList", aservice.getTobeSignList(cPage));
		return "approval/appMySignListView";
	}
	
	// error
	@ExceptionHandler
	public String exceptionalHandler(Exception e) {
		e.printStackTrace();
		return "error";
	}
}
