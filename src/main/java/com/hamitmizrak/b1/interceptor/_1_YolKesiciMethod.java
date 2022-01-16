package com.hamitmizrak.b1.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

// interceptor binding nedne olusturmadın
@_2_YolKesiciInterface
@Interceptor
public class _1_YolKesiciMethod {
	
	@AroundInvoke
	public Object aroundInvoke(InvocationContext context) throws Exception {
		
		System.out.println("önceki durumum " + context.getMethod().getName() + " " + context.getClass());
		
		// yol kesici hani nerde
		// database sorgulama yaptık,session ?
		boolean isLogin = false;
		Object isContinue = null;
		if (isLogin) {
			System.out.println("Öncelikle üye olunuz !!! üye sayfasına yönlendiriliyorsunuz");
			return null;
		} else {
			try {
				isContinue = context.proceed();// mühürledik artık devam edebilir.
				System.out.println(" Login olduuktan sonra : Yönlendirme yapılıyor ADmin sayfasına gidiyorsunuz");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return isContinue;
	}
	
}
