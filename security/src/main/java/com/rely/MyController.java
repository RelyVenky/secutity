package com.rely;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController
{
	@RequestMapping(value="/welcome")
	public ModelAndView sayWelcome()
	{
		return new ModelAndView(Messages.getString("MyController.0")); //$NON-NLS-1$
	}
	@RequestMapping(value="/admin")
	public ModelAndView sayWelcomeToAdmin()
	{
		return new ModelAndView(Messages.getString("MyController.1")); //$NON-NLS-1$
	}


}

