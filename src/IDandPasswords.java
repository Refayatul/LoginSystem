import java.util.HashMap;
public class IDandPasswords {



	HashMap logininfo = new HashMap();



	IDandPasswords(){



		logininfo.put("Bro","pizza");

		logininfo.put("Brometheus","PASSWORD");

		logininfo.put("BroCode","abc123");

	}



	public HashMap getLoginInfo(){

		return logininfo;

	}

}