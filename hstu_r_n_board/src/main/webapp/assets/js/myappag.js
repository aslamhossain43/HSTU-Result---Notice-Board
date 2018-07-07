$(function() {
	
	//adding a pre loader
	$(window).load(function(){
	
		setTimeout(function(){

			$(".preLoader").fadeOut("slow");
			
		},500);
		
        });

	
	
//for accessing ag l1s1 results
	
	var $agAllresults=$('#agAllresultsl1s1');
	
	if($agAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
			jsonUrl=jsonURLag;
			


	
		 $agAllresults.DataTable({
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
			  data:'agn101'
			 
			  
			  
		  },
		  {
			  data:'agn102'
			 
		  },
		  {
			  data:'ach101'
			 
		  },
		  {
			  data:'ach102'
			 
		  },
		  {
			  data:'ssc101'
			 
		  },
		  {
			  data:'ssc102'
			 
		  },
		  {
			  data:'ach103'
			 
		  },
		  {
			  data:'ssl103'
			 
		  },
		  {
			  data:'optional103'
			 
		  },
		  {
			  data:'gpa'
			 
		  }
		  
		  
		  
	  ]
		
		
		
		
	});
	} 
	
	
//for accessing ag l1s2 results
	
	var $agAllresults=$('#agAllresultsl1s2');
	
	if($agAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
			jsonUrl=jsonURLag;
			


	
		 $agAllresults.DataTable({
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
			  data:'hrt101'
			 
			  
			  
		  },
		  {
			  data:'hrt102'
			 
		  },
		  {
			  data:'ach105'
			 
		  },
		  {
			  data:'ame101'
			 
		  },
		  {
			  data:'ame102'
			 
		  },
		  {
			  data:'anh101'
			 
		  },
		  {
			  data:'anh102'
			 
		  },
		  {
			  data:'ecn101'
			 
		  },
		  {
			  data:'optionalt'
			 
		  },
		  {
			  data:'optionals'
			 
		  },
		  {
			  data:'gpa'
			 
		  }
		  
		  
		  
	  ]
		
		
		
		
	});
	} 
	
	
//for accessing ag l2s1 results
	
	var $agAllresults=$('#agAllresultsl2s1');
	
	if($agAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
			jsonUrl=jsonURLag;
			


	
		 $agAllresults.DataTable({
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
			  data:'agn201'
			 
			  
			  
		  },
		  {
			  data:'agn202'
			 
		  },
		  {
			  data:'ssc201'
			 
		  },
		  {
			  data:'ssc202'
			 
		  },
		  {
			  data:'hrt201'
			 
		  },
		  {
			  data:'hrt202'
			 
		  },
		  {
			  data:'cpe201'
			 
		  },
		  {
			  data:'cpe202'
			 
		  },
		  {
			  data:'bmb201'
			 
		  },
		  {
			  data:'bmb202'
			 
		  },
		  {
			  data:'gpa'
			 
		  }
		  
		  
		  
	  ]
		
		
		
		
	});
	} 
	
//for accessing ag l2s2 results
	
	var $agAllresults=$('#agAllresultsl2s2');
	
	if($agAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
			jsonUrl=jsonURLag;
			


	
		 $agAllresults.DataTable({
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
			  data:'ent201'
			 
			  
			  
		  },
		  {
			  data:'ent202'
			 
		  },
		  {
			  data:'plp201'
			 
		  },
		  {
			  data:'plp202'
			 
		  },
		  {
			  data:'gpb201'
			 
		  },
		  {
			  data:'gpb202'
			 
		  },
		  {
			  data:'aex201'
			 
		  },
		  {
			  data:'aex202'
			 
		  },
		  {
			  data:'stt201'
			 
		  },
		  {
			  data:'stt202'
			 
		  },
		  {
			  data:'gpa'
			 
		  }
		  
		  
		  
	  ]
		
		
		
		
	});
	} 
	
	
//for accessing ag l3s1 results
	
	var $agAllresults=$('#agAllresultsl3s1');
	
	if($agAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
			jsonUrl=jsonURLag;
			


	
		 $agAllresults.DataTable({
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
			  data:'ent301'
			 
			  
			  
		  },
		  {
			  data:'ent302'
			 
		  },
		  {
			  data:'plp301'
			 
		  },
		  {
			  data:'plp302'
			 
		  },
		  {
			  data:'gpb301'
			 
		  },
		  {
			  data:'gpb302'
			 
		  },
		  {
			  data:'agf301'
			 
		  },
		  {
			  data:'agf302'
			 
		  },
		  {
			  data:'aex301'
			 
		  },
		  {
			  data:'aex302'
			 
		  },
		  {
			  data:'gpa'
			 
		  }
		  
		  
		  
	  ]
		
		
		
		
	});
	} 
	
	
	
//for accessing ag l3s2 results
	
	var $agAllresults=$('#agAllresultsl3s2');
	
	if($agAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
			jsonUrl=jsonURLag;
			


	
		 $agAllresults.DataTable({
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
			  data:'agn301'
			 
			  
			  
		  },
		  {
			  data:'agn302'
			 
		  },
		  {
			  data:'ssc301'
			 
		  },
		  {
			  data:'ssc302'
			 
		  },
		  {
			  data:'ach301'
			 
		  },
		  {
			  data:'ach302'
			 
		  },
		  {
			  data:'hrt301'
			 
		  },
		  {
			  data:'hrt302'
			 
		  },
		  {
			  data:'cbt301'
			 
		  },
		  {
			  data:'cbt302'
			 
		  },
		  {
			  data:'gpa'
			 
		  }
		  
		  
		  
	  ]
		
		
		
		
	});
	} 
	
	
//for accessing ag l4s1 results
	
	var $agAllresults=$('#agAllresultsl4s1');
	
	if($agAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
			jsonUrl=jsonURLag;
			


	
		 $agAllresults.DataTable({
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
			  data:'ent401'
			 
			  
			  
		  },
		  {
			  data:'ent402'
			 
		  },
		  {
			  data:'cbt401'
			 
		  },
		  {
			  data:'cbt402'
			 
		  },
		  {
			  data:'aex401'
			 
		  },
		  {
			  data:'aex402'
			 
		  },
		  {
			  data:'hrt401'
			 
		  },
		  {
			  data:'hrt402'
			 
		  },
		  {
			  data:'effectivet'
			 
		  },
		  {
			  data:'effectives'
			 
		  },
		  {
			  data:'gpa'
			 
		  }
		  
		  
		  
	  ]
		
		
		
		
	});
	} 
	
	
	
	
//for accessing ag l4s2 results
	
	var $agAllresults=$('#agAllresultsl4s2');
	
	if($agAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
			jsonUrl=jsonURLag;
			


	
		 $agAllresults.DataTable({
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
			  data:'agn401'
			 
			  
			  
		  },
		  {
			  data:'agn402'
			 
		  },
		  {
			  data:'ssc401'
			 
		  },
		  {
			  data:'ssc402'
			 
		  },
		  {
			  data:'plp401'
			 
		  },
		  {
			  data:'plp402'
			 
		  },
		  {
			  data:'gpb401'
			 
		  },
		  {
			  data:'gpb402'
			 
		  },
		  {
			  data:'effectivet'
			 
		  },
		  {
			  data:'effectives'
			 
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
