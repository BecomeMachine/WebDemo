function startTestInterface(){
	accessSystemData();
	//accessSystemData_Text();
	//getReturnUsedRequestParam();
	//getReturnUsedRequestBody();
	//defaultServletRequestParams();
	//getElevatorString();
	//getElevatorObject();
	//getElevatorObjectList();	
};

function startTestView(){
	//getIndexView();
	//mediaInfoWithAddObject();
	//elevatorPageInfoWithModeMap();
	//elevatorPageInfoWithHashMap();
};

function accessSystemData(){
	  
		var region = {"regionID": 1};
		var jsonStr = JSON.stringify(region);
		$.ajax({
			url: "http://localhost:8080/WebDemo/dataDispatch/accessSystemData",
			type: "POST",
			data: jsonStr,
			contentType:"application/json; charset=utf-8",
			dataType: 'json',
			complete: function(data){
				$('#show').append("--------------SUCCESS------------------");	
			},
			Error: function(error,exception){
				alert("don't  alert");
			}
		});

};

function accessSystemData_Text(){
	
	$(document).ready(function(){  
		var region = {"regionID": 1};
	    var myData =  $.toJSON(region);
	    $.ajax({ 
	        type:"POST", 
	        url: "http://localhost:8080/WebDemo/dataDispatch/accessSystemData",
	        dataType:"text",
	        data: myData, 
	        success:function(data){ 
	        	$('#show').append(" /// json data:  return");                     
	        } 
	     }); 
	});  
};

function getReturnUsedRequestParam(){
	  
	var param = {"operateType": "1"};
	$.ajax({
		type: "POST",
		url: "http://localhost:8080/WebDemo/dataDispatch/getReturnUsedRequestParam",
		dataType: 'json',
		contentType:"application/x-www-form-urlencoded; charset=utf-8",
		data: param,
		success: function(data){           
			$('#show').append("--------------SUCCESS------------------");	
			alert(data);
		},
		Error: function(error,exception){
			alert("don't  alert");
		}
	});

};


function getReturnUsedRequestBody(){
	  
	var param = {"elevatorID": "1",
			     "elevatorName": "name"};
	var jsonStr = JSON.stringify(param);
	$.ajax({
		type: "POST",
		url: "http://localhost:8080/WebDemo/dataDispatch/getReturnUsedRequestBody",
		dataType: 'json',
		contentType:"application/json; charset=utf-8",
		data: jsonStr,
		success: function(data){           
			$('#show').append("--------------SUCCESS------------------");	
			alert(data);
		},
		Error: function(error,exception){
			alert("don't  alert");
		}
	});

};

function defaultServletRequestParams(){
	  
	var elevator = {"elevatorID": "1",
				    "elevatorName": "电梯1"
	};
	var jsonStr = JSON.stringify(elevator);
	$.ajax({
		url: "http://localhost:8080/WebDemo/dataDispatch/defaultServletRequestParams",
		type: "POST",
		dataType: 'json',
		data: elevator,
		contentType:"application/x-www-form-urlencoded; charset=utf-8",
		success: function(data){           
			$('#show').append("--------------SUCCESS------------------");	
			alert(data);
		},
		Error: function(error,exception){
			alert("don't  alert");
		}
	});

};


function getElevatorString(){
	  
	var elevator = {"elevatorID": "1",
				  "elevatorName": "电梯1"
	};
	var  principal = "tw";
	var jsonStr = JSON.stringify(elevator);
	$.ajax({
		url: "http://localhost:8080/WebDemo/dataDispatch/getElevatorString/" + principal,
		type: "POST",
		data: elevator,
		contentType:"application/x-www-form-urlencoded; charset=utf-8",
		dataType: 'json',
		success: function(data){          
			$('#show').append("--------------SUCCESS------------------");	
			alert(data);
		},
		Error: function(error,exception){
			alert("don't  alert");
		}
	});

};


function getElevatorObject(){
	  
	var elevator = {"elevatorID": "1",
				  "elevatorName": "电梯1"
	};
	var  principal = "tw2";
	var jsonStr = JSON.stringify(elevator);
	$.ajax({
		url: "http://localhost:8080/WebDemo/dataDispatch/getElevatorObject/" + principal,
		type: "GET",
		contentType:"application/x-www-form-urlencoded; charset=utf-8",
		dataType: 'json',
		data: elevator,
		success: function(data){           
			$('#show').append("--------------SUCCESS------------------");	
			alert(data);
		},
		Error: function(error,exception){
			alert("don't  alert");
		}
	});

};

function getElevatorObjectList(){
	  
	var elevator = {"elevatorID": "1",
				  "elevatorName": "电梯1"
	};
	var  principal = "tw3";
	var jsonStr = JSON.stringify(elevator);
	$.ajax({
		url: "http://localhost:8080/WebDemo/dataDispatch/getElevatorObjectList/" + principal,
		type: "GET",
		data: elevator,
		contentType:"application/x-www-form-urlencoded; charset=utf-8",
		dataType: 'json',
		success: function(data){           
			$('#show').append("--------------SUCCESS------------------");	
			alert(data);
		},
		Error: function(error,exception){
			alert("don't  alert");
		}
	});

};

function getIndexView(){
	
	$.ajax({
		url: "http://localhost:8080/WebDemo/pageDispatch/myIndex",
		type: "GET",
		data: null,		
		dataType: 'text',
		success: function(data){  
			$('#show').append("--------------SUCCESS------------------");	
			$('#show').append(data);
		},
		Error: function(error,exception){
			alert("don't  alert");
		}
	});

};

function mediaInfoWithAddObject(){
	var elevator = {"size": 2,
			        "count": 3
	};
	var jsonStr = JSON.stringify(elevator);
	$.ajax({
		url: "http://localhost:8080/WebDemo/pageDispatch/mediaInfoWithAddObject",
		type: "GET",
		//contentType:"application/x-www-form-urlencoded; charset=utf-8",
		dataType: 'text',
		data: elevator,	
		success: function(data){  
			$('#show').append("--------------SUCCESS------------------");	
			$('#show').append(data);
		},
		Error: function(error,exception){
			alert("don't  alert");
		}
	});
};


function elevatorPageInfoWithModeMap(){
	var elevator = {"elevatorID": 10,
			        "elevatorName": "FWO"
	};
	var jsonStr = JSON.stringify(elevator);
	$.ajax({
		url: "http://localhost:8080/WebDemo/pageDispatch/elevatorPageInfoWithModeMap",
		type: "GET",
		contentType:"application/x-www-form-urlencoded; charset=utf-8",
		dataType: 'text',
		data: elevator,	
		success: function(data){  
			$('#show').append("--------------SUCCESS------------------");	
			$('#show').append(data);
		},
		Error: function(error,exception){
			alert("don't  alert");
		}
	});
};


function elevatorPageInfoWithHashMap(){
	var elevator = {"elevatorID": 10,
			        "elevatorName": "FWO"
	};
	var jsonStr = JSON.stringify(elevator);
	$.ajax({
		url: "http://localhost:8080/WebDemo/pageDispatch/elevatorPageInfoWithHashMap",
		type: "GET",
		contentType:"application/x-www-form-urlencoded; charset=utf-8",
		dataType: 'text',
		data: elevator,	
		success: function(data){  
			$('#show').append("--------------SUCCESS------------------");	
			$('#show').append(data);
		},
		Error: function(error,exception){
			alert("don't  alert");
		}
	});
};


