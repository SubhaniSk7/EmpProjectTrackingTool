//$(document).ready(function(){
//	
//	var inputs = document.querySelectorAll('input[list]');
//  	for (var i = 0; i < inputs.length; i++) {
// 		console.log(inputs[i]);
// 		inputs[i].addEventListener('change', function() {
// 			var optionFound = false, datalist = this.list;
// 			console.log(datalist);
// 			for (var j = 0; j < datalist.options.length; j++) {
// 				if (this.value == datalist.options[j].value) {
//					
// 					optionFound = true;
// 					console.log(optionFound);
// 					break;
// 				}
// 				else{
// 					optionFound=false;
// 				}
// 			}
// 			if (optionFound) {
// 				this.setCustomValidity('');
// 				return true;
// 			}
// 			else {
// 				this.setCustomValidity('Please select value from suggested list only.');
// 				return false;
// 			}
//		});
// 	}
//});



$(document).ready(function(){
 		$(":input").on('change', function() {
 			var optionFound = false, datalist = this.list;
 			console.log(datalist);
 			for (var j = 0; j < datalist.options.length; j++) {
 				if (this.value == datalist.options[j].value) {
					
 					optionFound = true;
 					console.log(optionFound);
 					break;
 				}
 				else{
 					optionFound=false;
 				}
 			}
 			if (optionFound) {
 				this.setCustomValidity('');

 				$('button[type="submit"]').attr("disabled",false);
 			}
 			else {
 				this.setCustomValidity('Please select value from suggested list only.');
 				$('button[type="submit"]').attr("disabled",true);
 				alert("Please select value from suggested list only.");
 			}
		});
});