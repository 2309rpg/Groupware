package kh.gw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.gw.service.ScheduleService;

@Controller
@RequestMapping("/schedule")
public class ScheduleController {
	@Autowired
	private ScheduleService sservice;
}
