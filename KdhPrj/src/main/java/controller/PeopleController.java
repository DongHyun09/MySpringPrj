package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/peop/")
public class PeopleController {

		@RequestMapping("me/mebody")
		public String me() {
			
			return "people.me";
		}
}
