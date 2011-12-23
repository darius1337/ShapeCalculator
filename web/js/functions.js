/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

$().ready(function() {
	
	$("#AddCoordinateForm").validate(); 
        $("#coordsForm").validate({
            errorLabelContainer: $("#coordsForm div.error"),
            rules: { coordGroup : {required :true}},            
            messages: { coordGroup : "Please select atleast one group!" }
        })
});

