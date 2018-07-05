$(function() {
	
	//adding a pre loader
	$(window).load(function(){
	
		setTimeout(function(){

			$(".preLoader").fadeOut("slow");
			
		},500);
		
        });
	
	//for accessing ag img and description in result
	
//for accessing ag img and description in notices
	
	var $imgrn=$('#imgrn');
	
	if($imgrn.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
		 switch(filejsonURL){
		case contextRoot+'/ag/all/results':
			jsonUrl=contextRoot+'/ag/all/results';
			break;
		case contextRoot+'/ag/all/notices':
			jsonUrl=contextRoot+'/ag/all/notices';
			break;

		case contextRoot+'/fis/all/results':
			jsonUrl=contextRoot+'/fis/all/results';
			break;
		case contextRoot+'/fis/all/notices':
			jsonUrl=contextRoot+'/fis/all/notices';
			break;
			
		
		case contextRoot+'/bba/all/results':
			jsonUrl=contextRoot+'/bba/all/results';
			break;
		case contextRoot+'/bba/all/notices':
			jsonUrl=contextRoot+'/bba/all/notices';
			break;
			
		case contextRoot+'/cse/all/results':
			jsonUrl=contextRoot+'/cse/all/results';
			break;
		case contextRoot+'/cse/all/notices':
			jsonUrl=contextRoot+'/cse/all/notices';
			break;
		case contextRoot+'/dvm/all/results':
			jsonUrl=contextRoot+'/dvm/all/results';
			break;
		case contextRoot+'/dvm/all/notices':
			jsonUrl=contextRoot+'/dvm/all/notices';
			break;
		case contextRoot+'/eng/all/results':
			jsonUrl=contextRoot+'/eng/all/results';
			break;
		case contextRoot+'/eng/all/notices':
			jsonUrl=contextRoot+'/eng/all/notices';
			break;
		case contextRoot+'/sc/all/results':
			jsonUrl=contextRoot+'/sc/all/results';
			break;
		case contextRoot+'/sc/all/notices':
			jsonUrl=contextRoot+'/sc/all/notices';
			break;
		case contextRoot+'/soc/all/results':
			jsonUrl=contextRoot+'/soc/all/results';
			break;
		case contextRoot+'/soc/all/notices':
			jsonUrl=contextRoot+'/soc/all/notices';
			break;
		
		}


	
		$imgrn.DataTable({
	  lengthMenu:[[3,5,-1],['3 files','5 files','All']],
	  pageLength:3,
	  ajax:{
		  url:jsonUrl,
		  dataSrc : ''
		 
		  
	  },
	  columns : [
		  {
			  data:'description'
			 
		  },
		  {
			  data:'img_url',
			  bSortable:false,
			  mRender:function(data,type,row){
				  return '<img src="'+window.contextRoot
				  +'/assets/images/'
				  +data+'.jpg" class="fileResults"/>';
				  
				  
				  
			  }
			  
			  
			  
		  }
		 
		  
		  
	  ]
		
		
		
		
	});
	}
//for accessing ECE l1s1 results
	
	var $eceAllresults=$('#eceAllresultsl1s1');
	
	if($eceAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
			jsonUrl=jsonURLece;
			


	
		 $eceAllresults.DataTable({
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
			  data:'cse107'
			 
			  
			  
		  },
		  {
			  data:'cse108'
			 
		  },
		  {
			  data:'mat109'
			 
		  },
		  {
			  data:'aie107'
			 
		  },
		  {
			  data:'aie108'
			 
		  },
		  {
			  data:'ssl107'
			 
		  },
		  {
			  data:'phy111'
			 
		  },
		  {
			  data:'phy112'
			 
		  },
		  {
			  data:'gpa'
			 
		  }
		  
		  
		  
	  ]
		
		
		
		
	});
	} 
//for accessing ECE l1s2 results
	
	var $eceAllresults=$('#eceAllresultsl1s2');
	
	if($eceAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
	
			jsonUrl=jsonURLece;
			
		 $eceAllresults.DataTable({
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
					  data:'aie110'
					 
					  
					  
				  },
				  {
					  data:'mat113'
					 
				  },
				  {
					  data:'ece101'
					 
				  },
				  {
					  data:'ece102'
					 
				  },
				  {
					  data:'eee103'
					 
				  },
				  {
					  data:'eee104'
					 
				  },
				  {
					  data:'soc105'
					 
				  },
				  {
					  data:'cse159'
					 
				  }, {
					  data:'cse160'
					 
				  }, {
					  data:'cse161'
					 
				  },
				  {
					  data:'gpa'
					 
				  }
				  
				  
				  
			  ]
				
				
				
				
			});
	}

//for accessing ECE l2s1 results
	
	var $eceAllresults=$('#eceAllresultsl2s1');
	
	if($eceAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
	
			jsonUrl=jsonURLece;
			
		 $eceAllresults.DataTable({
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
					  data:'ece205'
					 
					  
					  
				  },
				  {
					  data:'ece206'
					 
				  },
				  {
					  data:'cse211'
					 
				  },
				  {
					  data:'cse212'
					 
				  },
				  {
					  data:'ece203'
					 
				  },
				  {
					  data:'ece204'
					 
				  },
				  {
					  data:'cse213'
					 
				  },
				  {
					  data:'cse214'
					 
				  }, {
					  data:'stt211'
					 
				  }, {
					  data:'stt212'
					 
				  },{
					  data:'mat205'
					 
				  },
				  {
					  data:'gpa'
					 
				  }
				  
				  
				  
			  ]
				
				
				
				
			});
	}
//for accessing ECE l2s2 results
	
	var $eceAllresults=$('#eceAllresultsl2s2');
	
	if($eceAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
	
			jsonUrl=jsonURLece;
			
		 $eceAllresults.DataTable({
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
					  data:'ece211'
					 
					  
					  
				  },
				  {
					  data:'ece212'
					 
				  },
				  {
					  data:'ece207'
					 
				  },
				  {
					  data:'ece208'
					 
				  },
				  {
					  data:'ece209'
					 
				  },
				  {
					  data:'ece210'
					 
				  },
				  {
					  data:'eee207'
					 
				  },
				  {
					  data:'eee208'
					 
				  }, {
					  data:'cse261'
					 
				  }, {
					  data:'cse262'
					 
				  },{
					  data:'mat207'
					 
				  },{
					  data:'ece200'
					 
				  },
				  {
					  data:'gpa'
					 
				  }
				  
				  
				  
			  ]
				
				
				
				
			});
	}
	
//for accessing ECE l3s1 results
	
	var $eceAllresults=$('#eceAllresultsl3s1');
	
	if($eceAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
	
			jsonUrl=jsonURLece;
			
		 $eceAllresults.DataTable({
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
					  data:'cse315'
					 
					  
					  
				  },
				  {
					  data:'cse316'
					 
				  },
				  {
					  data:'ece313'
					 
				  },
				  {
					  data:'ece314'
					 
				  },
				  {
					  data:'ece315'
					 
				  },
				  {
					  data:'ece316'
					 
				  },
				  {
					  data:'ece329'
					 
				  },
				  {
					  data:'ece330'
					 
				  }, {
					  data:'act307'
					 
				  }, {
					  data:'cse317'
					 
				  },{
					  data:'cse318'
					 
				  },
				  {
					  data:'gpa'
					 
				  }
				  
				  
				  
			  ]
				
				
				
				
			});
	}
	
	
//for accessing ECE l3s2 results
	
	var $eceAllresults=$('#eceAllresultsl3s2');
	
	if($eceAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
	
			jsonUrl=jsonURLece;
			
		 $eceAllresults.DataTable({
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
					  data:'ece317'
					 
					  
					  
				  },
				  {
					  data:'ece318'
					 
				  },
				  {
					  data:'ece319'
					 
				  },
				  {
					  data:'ece320'
					 
				  },
				  {
					  data:'ece321'
					 
				  },
				  {
					  data:'ece322'
					 
				  },
				  {
					  data:'cse377'
					 
				  },
				  {
					  data:'cse378'
					 
				  }, {
					  data:'cse371'
					 
				  }, {
					  data:'cse372'
					 
				  },{
					  data:'ecn307'
					 
				  },
				  {
					  data:'gpa'
					 
				  }
				  
				  
				  
			  ]
				
				
				
				
			});
	}
	
	
//for accessing ECE l4s1 results
	
	var $eceAllresults=$('#eceAllresultsl4s1');
	
	if($eceAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
	
			jsonUrl=jsonURLece;
			
		 $eceAllresults.DataTable({
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
					  data:'eee423'
					 
					  
					  
				  },
				  {
					  data:'eee424'
					 
				  },
				  {
					  data:'ece425'
					 
				  },
				  {
					  data:'ece426'
					 
				  },
				  {
					  data:'ece451'
					 
				  },
				  {
					  data:'ece452'
					 
				  },
				  {
					  data:'ece427'
					 
				  },
				  {
					  data:'ece428'
					 
				  }, {
					  data:'ece431'
					 
				  }, {
					  data:'ece429'
					 
				  },{
					  data:'ece471'
					 
				  },
				  {
					  data:'ece402'
					 
				  },
				  {
					  data:'gpa'
					 
				  }
				  
				  
				  
			  ]
				
				
				
				
			});
	}
	
//for accessing ECE l4s2 results
	
	var $eceAllresults=$('#eceAllresultsl4s2');
	
	if($eceAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
	
			jsonUrl=jsonURLece;
			
		 $eceAllresults.DataTable({
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
					  data:'ece475'
					 
				  },
				  {
					  data:'ece476'
					 
				  },
				  {
					  data:'ece437'
					 
				  },
				  {
					  data:'ece438'
					 
				  },
				  {
					  data:'ece477'
					 
				  },
				  {
					  data:'ece478'
					 
				  }, {
					  data:'ece439'
					 
				  }, {
					  data:'ece435'
					 
				  },{
					  data:'ece404'
					 
				  },
				  {
					  data:'ece400'
					 
				  },
				  {
					  data:'gpa'
					 
				  }
				  
				  
				  
			  ]
				
				
				
				
			});
	}
	
	
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

