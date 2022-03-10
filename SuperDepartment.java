
public class SuperDepartment {
	

	 String departmentName() {
		return "Super Department";
	}
	 String getTodaysWork() {
		return "No Work as of now";
	}
	
	String getWorkDeadline() {
		return "Nil";
	}
	
	String isTodayAHoliday() {
		return "Today is not a holiday";
	}
	
	public static void main(String[] args) {
		SuperDepartment adminObj = new AdminDepartment();
		System.out.println(adminObj.departmentName());
		System.out.println(adminObj.getTodaysWork());
		System.out.println(adminObj.getWorkDeadline());
		System.out.println(adminObj.isTodayAHoliday());
		System.out.println();
		
		SuperDepartment hrObj = new HrDepartment();
		System.out.println(hrObj.departmentName());
		//using subclass reference to call subclass methods only , Since this method is not present in Super class , it can't be called bt super class object .
		// We can use HrDepartment hrdept = new HrDepartment() ; hrdept..doActivity(); also .  
		System.out.println(((HrDepartment) hrObj).doActivity());
		System.out.println(hrObj.getTodaysWork());
		System.out.println(hrObj.getWorkDeadline());
		System.out.println(hrObj.isTodayAHoliday());
		System.out.println();
		
		SuperDepartment techObj = new TechDepartment();
		System.out.println(techObj.departmentName());
		System.out.println(techObj.getTodaysWork());
		System.out.println(techObj.getWorkDeadline());
		System.out.println(((TechDepartment) techObj).getTechStackInformation());
		System.out.println(techObj.isTodayAHoliday());
		
	}
	
	
}

class AdminDepartment extends SuperDepartment{
	String departmentName() {
		return "Welcome to Admin Department";
	}
	String getTodaysWork() {
		return "Complete your documents Submission";
	}
	String getWorkDeadline() {
		return "Complete by EOD";
	}
}

class HrDepartment extends SuperDepartment{
	String departmentName() {
		return "Welcome to Hr Department";
	}
	String getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}
	String getWorkDeadline() {
		return "Complete by EOD";
	}
	String doActivity() {
		return "team Lunch";
	}
}
	class TechDepartment extends SuperDepartment{
		String departmentName() {
			return "Welcome to Tech Department";
		}
		String getTodaysWork() {
			return "Complete coding of module 1";
		}
		String getWorkDeadline() {
			return "Complete by EOD";
		}
		String getTechStackInformation() {
			return "core Java";
		}

}
