$(document).ready(function(){
	$.ajax({
		url: 'classifica',
		type : 'GET',
		success : function(json){
			var myJ = JSON.parse(json);
		}
	});
});

function drawTable(data){
	for (var i = 0;i<data.length;i++){
		drawRow(data[i]);
	}
}
function drawRow(rowDa){
	var row = $("<tr />")
	$("#table").append(row);
	row.append($("<td>"+rowData.nome+"</td>"));
	row.append($("<td>"+rowData.vittorie+"</td>"));
	row.append($("<td>"+rowData.golFatti+"</td>"));
	row.append($("<td>"+rowData.golSubiti+"</td>"));
	row.append($("<td>"+rowData.punteggio+"</td>"));
}