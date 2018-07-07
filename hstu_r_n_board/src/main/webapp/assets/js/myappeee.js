$(function() {
	
	//adding a pre loader
	$(window).load(function(){
	
		setTimeout(function(){

			$(".preLoader").fadeOut("slow");
			
		},500);
		
        });

	

	

//for accessing EEE l1s1 results
	
	var $eeeAllresults=$('#eeeAllresultsl1s1');
	
	if($eeeAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
			jsonUrl=jsonURLeee;
			


	
		 $eeeAllresults.DataTable({
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
			  data:'eee105'
			 
			  
			  
		  },
		  {
			  data:'eee106'
			 
		  },
		  {
			  data:'ach117'
			 
		  },
		  {
			  data:'ach118'
			 
		  },
		  {
			  data:'map115'
			 
		  },
		  {
			  data:'map116'
			 
		  },
		  {
			  data:'map129'
			 
		  },
		  {
			  data:'map131'
			 
		  },
		  {
			  data:'aie124'
			 
		  },
		  {
			  data:'gpa'
			 
		  }
		  
		  
		  
	  ]
		
		
		
		
	});
	} 
	
	
	
//for accessing EEE l1s2 results
	
	var $eeeAllresults=$('#eeeAllresultsl1s2');
	
	if($eeeAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
			jsonUrl=jsonURLeee;
			


	
		 $eeeAllresults.DataTable({
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
			  data:'eee107'
			 
			  
			  
		  },
		  {
			  data:'eee108'
			 
		  },
		  {
			  data:'eee110'
			 
		  },
		  {
			  data:'map133'
			 
		  },
		  {
			  data:'map134'
			 
		  },
		  {
			  data:'cit117'
			 
		  },
		  {
			  data:'cit118'
			 
		  },
		  {
			  data:'map135'
			 
		  },
		  {
			  data:'ssl121'
			 
		  },
		  {
			  data:'gpa'
			 
		  }
		  
		  
		  
	  ]
		
		
		
		
	});
	} 
	
	
//for accessing EEE l2s1 results
	
	var $eeeAllresults=$('#eeeAllresultsl2s1');
	
	if($eeeAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
			jsonUrl=jsonURLeee;
			


	
		 $eeeAllresults.DataTable({
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
			  data:'eee211'
			 
			  
			  
		  },
		  {
			  data:'eee212'
			 
		  },
		  {
			  data:'eee213'
			 
		  },
		  {
			  data:'eee214'
			 
		  },
		  {
			  data:'eee215'
			 
		  },
		  {
			  data:'map213'
			 
		  },
		  {
			  data:'ssl223'
			 
		  },
		  {
			  data:'ecn277'
			 
		  },
		  {
			  data:'gpa'
			 
		  }
		  
		  
		  
	  ]
		
		
		
		
	});
	} 
	
	
//for accessing EEE l2s2 results
	
	var $eeeAllresults=$('#eeeAllresultsl2s2');
	
	if($eeeAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
			jsonUrl=jsonURLeee;
			


	
		 $eeeAllresults.DataTable({
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
			  data:'eee217'
			 
			  
			  
		  },
		  {
			  data:'eee218'
			 
		  },
		  {
			  data:'eee219'
			 
		  },
		  {
			  data:'eee220'
			 
		  },
		  {
			  data:'ece215'
			 
		  },
		  {
			  data:'aie227'
			 
		  },
		  {
			  data:'aie228'
			 
		  },
		  {
			  data:'stt223'
			 
		  },
		  {
			  data:'stt224'
			 
		  },
		  {
			  data:'gpa'
			 
		  }
		  
		  
		  
	  ]
		
		
		
		
	});
	} 
	
	
//for accessing EEE l3s1 results
	
	var $eeeAllresults=$('#eeeAllresultsl3s1');
	
	if($eeeAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
			jsonUrl=jsonURLeee;
			


	
		 $eeeAllresults.DataTable({
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
			  data:'eee307'
			 
			  
			  
		  },
		  {
			  data:'eee309'
			 
		  },
		  {
			  data:'eee310'
			 
		  },
		  {
			  data:'eee311'
			 
		  },
		  {
			  data:'ece351'
			 
		  },
		  {
			  data:'ece352'
			 
		  },
		  {
			  data:'eee300'
			 
		  },
		  {
			  data:'eee315'
			 
		  },
		  {
			  data:'act305'
			 
		  },
		  {
			  data:'gpa'
			 
		  }
		  
		  
		  
	  ]
		
		
		
		
	});
	} 
	
//for accessing EEE l3s2 results
	
	var $eeeAllresults=$('#eeeAllresultsl3s2');
	
	if($eeeAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
			jsonUrl=jsonURLeee;
			


	
		 $eeeAllresults.DataTable({
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
			  data:'eee317'
			 
			  
			  
		  },
		  {
			  data:'eee318'
			 
		  },
		  {
			  data:'ece353'
			 
		  },
		  {
			  data:'ece354'
			 
		  },
		  {
			  data:'cen331'
			 
		  },
		  {
			  data:'cen332'
			 
		  },
		  {
			  data:'eee323'
			 
		  },
		  {
			  data:'eee324'
			 
		  },
		  {
			  data:'mgt309'
			 
		  },
		  {
			  data:'gpa'
			 
		  }
		  
		  
		  
	  ]
		
		
		
		
	});
	} 
	
//for accessing EEE l4s1 results
	
	var $eeeAllresults=$('#eeeAllresultsl4s1');
	
	if($eeeAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
			jsonUrl=jsonURLeee;
			


	
		 $eeeAllresults.DataTable({
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
			  data:'eee400'
			 
			  
			  
		  },
		  {
			  data:'eee403'
			 
		  },
		  {
			  data:'eee405'
			 
		  },
		  {
			  data:'eee406'
			 
		  },
		  {
			  data:'effective1'
			 
		  },
		  {
			  data:'effective2'
			 
		  },
		  {
			  data:'gpa'
			 
		  }
		  
		  
		  
	  ]
		
		
		
		
	});
	} 
//for accessing EEE l4s2 results
	
	var $eeeAllresults=$('#eeeAllresultsl4s2');
	
	if($eeeAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
			jsonUrl=jsonURLeee;
			


	
		 $eeeAllresults.DataTable({
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
			  data:'eee400'
			 
			  
			  
		  },
		  {
			  data:'eee407'
			 
		  },
		  {
			  data:'eee408'
			 
		  },
		  {
			  data:'effective3'
			 
		  },
		  {
			  data:'effective4'
			 
		  },
		  {
			  data:'effective5'
			 
		  },
		  {
			  data:'eee444'
			 
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
