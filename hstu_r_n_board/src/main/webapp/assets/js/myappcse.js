$(function() {
	
	//adding a pre loader
	$(window).load(function(){
	
		setTimeout(function(){

			$(".preLoader").fadeOut("slow");
			
		},500);
		
        });

	
	
	
	
	
	
	
	
	
	
	
	
//for accessing CSE l1s1 results
	
	var $cseAllresults=$('#cseAllresultsl1s1');
	
	if($cseAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
			jsonUrl=jsonURLcse;
			


	
		 $cseAllresults.DataTable({
	  lengthMenu:[[30,73,-1],['30 files','73 files','All']],
	  pageLength:30,
	  ajax:{
		  url:jsonUrl,
		  dataSrc : ''
		 
		  
	  },
	  columns : [
		  
		  {
			data:'sid'  
		  },
		  
		  
		  {
			  data:'cse101'
			 
			  
			  
		  },
		  {
			  data:'cse102'
			 
		  },
		  {
			  data:'cse103'
			 
		  },
		  {
			  data:'mat101'
			 
		  },
		  {
			  data:'phy103'
			 
		  },
		  {
			  data:'phy104'
			 
		  },
		  {
			  data:'aie105'
			 
		  },
		  
		  {
			  data:'eng101'
			 
		  },
		  
		  {
			  data:'eng102'
			 
		  },
		  {
			  data:'gpa'
			 
		  }
		  
		  
		  
	  ]
		
		
		
		
	});
	} 
	
//for accessing CSE l1s2 results
	
	var $cseAllresults=$('#cseAllresultsl1s2');
	
	if($cseAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
			jsonUrl=jsonURLcse;
			


	
		 $cseAllresults.DataTable({
	  lengthMenu:[[30,73,-1],['30 files','73 files','All']],
	  pageLength:30,
	  ajax:{
		  url:jsonUrl,
		  dataSrc : ''
		 
		  
	  },
	  columns : [
		  
		  {
			data:'sid'  
		  },
		  
		  
		  {
			  data:'cse151'
			 
			  
			  
		  },
		  {
			  data:'cse152'
			 
		  },
		  {
			  data:'cse153'
			 
		  },
		  {
			  data:'cse154'
			 
		  },
		  {
			  data:'eee155'
			 
		  },
		  {
			  data:'eee156'
			 
		  },
		  {
			  data:'aie106'
			 
		  },
		  
		  {
			  data:'mat105'
			 
		  },
		  
		  {
			  data:'soc103'
			 
		  },
		  {
			  data:'gpa'
			 
		  }
		  
		  
		  
	  ]
		
		
		
		
	});
	} 
	
//for accessing CSE l2s1 results
	
	var $cseAllresults=$('#cseAllresultsl2s1');
	
	if($cseAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
			jsonUrl=jsonURLcse;
			


	
		 $cseAllresults.DataTable({
	  lengthMenu:[[30,73,-1],['30 files','73 files','All']],
	  pageLength:30,
	  ajax:{
		  url:jsonUrl,
		  dataSrc : ''
		 
		  
	  },
	  columns : [
		  
		  {
			data:'sid'  
		  },
		  
		  
		  {
			  data:'cse201'
			 
			  
			  
		  },
		  {
			  data:'cse202'
			 
		  },
		  {
			  data:'cse203'
			 
		  },
		  {
			  data:'cse204'
			 
		  },
		  {
			  data:'cse205'
			 
		  },
		  {
			  data:'cse206'
			 
		  },
		  {
			  data:'eee209'
			 
		  },
		  
		  {
			  data:'eee210'
			 
		  },
		  
		  {
			  data:'mat201'
			 
		  },
		  {
			  data:'stt227'
			 
		  },
		  {
			  data:'gpa'
			 
		  }
		  
		  
		  
	  ]
		
		
		
		
	});
	} 
	
	
//for accessing CSE l2s2 results
	
	var $cseAllresults=$('#cseAllresultsl2s2');
	
	if($cseAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
			jsonUrl=jsonURLcse;
			


	
		 $cseAllresults.DataTable({
	  lengthMenu:[[30,73,-1],['30 files','73 files','All']],
	  pageLength:30,
	  ajax:{
		  url:jsonUrl,
		  dataSrc : ''
		 
		  
	  },
	  columns : [
		  
		  {
			data:'sid'  
		  },
		  
		  
		  {
			  data:'cse254'
			 
			  
			  
		  },
		  {
			  data:'cse255'
			 
		  },
		  {
			  data:'cse256'
			 
		  },
		  {
			  data:'cse257'
			 
		  },
		  {
			  data:'cse258'
			 
		  },
		  {
			  data:'cse259'
			 
		  },
		  {
			  data:'ece259'
			 
		  },
		  
		  {
			  data:'ece260'
			 
		  },
		  
		  {
			  data:'act205'
			 
		  },
		  {
			  data:'cse252'
			 
		  },
		  {
			  data:'gpa'
			 
		  }
		  
		  
		  
	  ]
		
		
		
		
	});
	} 
	
	
//for accessing CSE l3s1 results
	
	var $cseAllresults=$('#cseAllresultsl3s1');
	
	if($cseAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
			jsonUrl=jsonURLcse;
			


	
		 $cseAllresults.DataTable({
	  lengthMenu:[[30,73,-1],['30 files','73 files','All']],
	  pageLength:30,
	  ajax:{
		  url:jsonUrl,
		  dataSrc : ''
		 
		  
	  },
	  columns : [
		  
		  {
			data:'sid'  
		  },
		  
		  
		  {
			  data:'cse303'
			 
			  
			  
		  },
		  {
			  data:'cse304'
			 
		  },
		  {
			  data:'cse305'
			 
		  },
		  {
			  data:'cse307'
			 
		  },
		  {
			  data:'cse308'
			 
		  },
		  {
			  data:'ece311'
			 
		  },
		  
		  {
			  data:'ecn305'
			 
		  },
		  
		  {
			  data:'cse302'
			 
		  },
		  {
			  data:'gpa'
			 
		  }
		  
		  
		  
	  ]
		
		
		
		
	});
	} 
//for accessing CSE l3s2 results
	
	var $cseAllresults=$('#cseAllresultsl3s2');
	
	if($cseAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
			jsonUrl=jsonURLcse;
			


	
		 $cseAllresults.DataTable({
	  lengthMenu:[[30,73,-1],['30 files','73 files','All']],
	  pageLength:30,
	  ajax:{
		  url:jsonUrl,
		  dataSrc : ''
		 
		  
	  },
	  columns : [
		  
		  {
			data:'sid'  
		  },
		  
		  
		  {
			  data:'cse353'
			 
			  
			  
		  },
		  {
			  data:'cse354'
			 
		  },
		  {
			  data:'cse355'
			 
		  },
		  {
			  data:'cse356'
			 
		  },
		  {
			  data:'cse357'
			 
		  },
		  {
			  data:'cse358'
			 
		  },
		  {
			  data:'cse359'
			 
		  },
		  
		  {
			  data:'cse360'
			 
		  },
		  
		  {
			  data:'cse361'
			 
		  },
		  {
			  data:'cse352'
			 
		  },
		  {
			  data:'gpa'
			 
		  }
		  
		  
		  
	  ]
		
		
		
		
	});
	} 
//for accessing CSE l4s1 results
	
	var $cseAllresults=$('#cseAllresultsl4s1');
	
	if($cseAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
			jsonUrl=jsonURLcse;
			


	
		 $cseAllresults.DataTable({
	  lengthMenu:[[30,73,-1],['30 files','73 files','All']],
	  pageLength:30,
	  ajax:{
		  url:jsonUrl,
		  dataSrc : ''
		 
		  
	  },
	  columns : [
		  
		  {
			data:'sid'  
		  },
		  
		  
		  {
			  data:'cse403'
			 
			  
			  
		  },
		  {
			  data:'cse404'
			 
		  },
		  {
			  data:'cse405'
			 
		  },
		  {
			  data:'cse406'
			 
		  },
		  {
			  data:'cseop1'
			 
		  },
		  {
			  data:'cseop1s'
			 
		  },
		  {
			  data:'cseop2'
			 
		  },
		  
		  {
			  data:'cseop2s'
			 
		  },
		  
		  {
			  data:'cse408'
			 
		  },
		  {
			  data:'cse402'
			 
		  },
		  {
			  data:'gpa'
			 
		  }
		  
		  
		  
	  ]
		
		
		
		
	});
	} 
	
//for accessing CSE l4s2 results
	
	var $cseAllresults=$('#cseAllresultsl4s2');
	
	if($cseAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
			jsonUrl=jsonURLcse;
			


	
		 $cseAllresults.DataTable({
	  lengthMenu:[[30,73,-1],['30 files','73 files','All']],
	  pageLength:30,
	  ajax:{
		  url:jsonUrl,
		  dataSrc : ''
		 
		  
	  },
	  columns : [
		  
		  {
			data:'sid'  
		  },
		  
		  
		  {
			  data:'cse453'
			 
			  
			  
		  },
		  {
			  data:'cse454'
			 
		  },
		  {
			  data:'cse455'
			 
		  },
		  {
			  data:'mgt405'
			 
		  },
		  {
			  data:'cseop3'
			 
		  },
		  {
			  data:'cseop3s'
			 
		  },
		  {
			  data:'cseop4'
			 
		  },
		  
		  {
			  data:'cseop4s'
			 
		  },
		  
		  {
			  data:'cse452'
			 
		  },
		  {
			  data:'gpa'
			 
		  }
		  
		  
		  
	  ]
		
		
		
		
	});
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*alert message*/
	var alert=$('.alert');
	if(alert.length){
		setTimeout(function(){
			
			alert.fadeOut("slow");
			
			
		},3000);
		
	}
	
	//loginForm
	
	var $loginForm = $('#loginForm');

	if ($loginForm.length) {

		$loginForm.validate({
			rules : {
				username : {
					required : true,
					email : true
				},
				password : {
					required : true

				}
			},
			messages : {
				username : {
					required : 'Please enter enter the username!',
					email : 'Please enter valid email address'
				},
				password : {
					required : 'Please enter the password!'

				}
			},
			errorElement : "em",
			errorPlacement : function(error, element) {

				errorPlacement(error, element);
			}
		}

		);

	}


	//called method
	
	function errorPlacement(error,element){
		//for css coloring
		error.addClass("help-block");
		//show error msg below the label
		error.insertAfter(element);
		element.parents(".validate").addClass("has-feedback");
	}
	
	
	
	
	
	
	
});