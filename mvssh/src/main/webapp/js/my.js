function login() {
	 var data = $("#loginform").serialize();     
	   $.ajax({ 
	    type:'post',  
	    url:"index_companyInfo", 
	    cache: false,
	    data:data,  //重点必须为一个变量如：data
	   // dataType:'json', 
	    success:function(data){      
	    	alert(data);
	    },
	    error:function(){ 
	     alert("请求失败")
	    }
	   })
}

function reg() {
	var data = $("#regform").serialize();     
	   $.ajax({ 
	    type:'post',  
	    url:"register", 
	    cache: false,
	    data:data,  //重点必须为一个变量如：data
	   // dataType:'json', 
	    success:function(data){      
	    	alert(data);
	    	window.location.href="index.html"
	    },
	    error:function(){ 
	     alert("请求失败")
	    }
	   })
}