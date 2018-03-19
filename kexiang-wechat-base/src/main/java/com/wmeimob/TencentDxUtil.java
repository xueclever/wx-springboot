package com.wmeimob;

import java.util.ArrayList;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;

/**
 * 腾讯短信接口
 * @author Administrator
 *
 */
public class TencentDxUtil {

	public static void main(String[] args) {
		try {
		    SmsSingleSender sender = new   SmsSingleSender(1400069836, "96e2b852951eb6a239961faa132b4f0a");
		    ArrayList<String> params = new ArrayList<String>();
		    params.add("873823");
		    params.add("2");
		    SmsSingleSenderResult   result = sender.sendWithParam("86", "15173139267", 89949, params, "", "", "");
		    System.out.println(result);
		System.out.print(result);
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
}
