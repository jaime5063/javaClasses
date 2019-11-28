package com.class25;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("Create an object of Employee class");
		Employee emp = new Employee();
		emp.salary=70000;
		Employee.companyName="Syntax";
		emp.work();
		emp.getPaid();
		
		System.out.println("Create an object of ScrumTeam class");
		ScrumTeam sm = new ScrumTeam();
		sm.salary=90000;
		sm.work();
		sm.getPaid();
		sm.artifacts="Prouct Backlog, Sprint Backlog, BurnDownChart";
		sm.ceremonies="Sprint demo, planning, retro and daily standup";
		sm.attendScrumMeetings();
		
		System.out.println("Create an object of developer class");
		Developer dev = new Developer();
		dev.salary=130000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts="Sprint Backlog";
		dev.ceremonies="Sprint demo, planning, retro and daily standup";
		dev.attendScrumMeetings();
		
		System.out.println("Create an object of Tester class");
		Tester test = new Tester();
		test.salary=90000;
		test.work();
		test.getPaid();
		test.testing();
		test.artifacts="Sprint Backlog";
		test.ceremonies="Sprint demo, planning, retro and daily standup";
		test.attendScrumMeetings();		
			System.out.println("Create an object of ScrumMaster class");
			ScrumMaster master = new ScrumMaster();
			master.salary=100000;
			master.work();
			master.getPaid();
			master.coordinatesTeam();
			master.artifacts="Prouct Backlog, Sprint Backlog, BurnDownChart";
			master.ceremonies="Sprint demo, planning, retro and daily standup";
			master.attendScrumMeetings();		
		System.out.println("Create an object of Product Owner class");
		ProductOwner po = new ProductOwner();
		po.salary=120000;
		po.work();
		po.getPaid();
		po.backlog();
		po.artifacts="Prouct Backlog, Sprint Backlog, BurnDownChart";
		po.ceremonies="Sprint demo, planning, retro and daily standup";
		po.attendScrumMeetings();	
			System.out.println("Create an object of Business Analyst class");
			BusinessAnalyst ba = new BusinessAnalyst();
			ba.salary=130000;
			ba.work();
			ba.getPaid();
			ba.requirements();
			ba.artifacts="Prouct Backlog, Sprint Backlog, BurnDownChart";
			ba.ceremonies="Sprint demo, planning, retro and daily standup";
			ba.attendScrumMeetings();
		
	}

}
