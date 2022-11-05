Hello to All<br>
Hello to All<br>
Hello to All<br>
Hello to All<br>
Hello to All<br>
<div id='someId'>Initial Content</div>
Hello to All<br>
Hello to All<br>
Hello to All<br>
Hello to All<br>

<a href='#' onclick="replaceData()">Click Here</a>

<script>
	
function replaceData() 
{
    var request;
    
    if (window.ActiveXObject)
    {
    	request=new ActiveXObject("Microsoft.XMLHTTP");
    } 
    else if (window.XMLHttpRequest) 
    {
    	request=new XMLHttpRequest();
    }
    else 
    {
        return(null);
    }
    
    request.onreadystatechange =  function() 
    {
        handleResponse(request);
    };
    request.open("GET", "answer.jsp", true);
    request.send();
}

function handleResponse(request) {
    if (request.readyState == 4) 
    {
    	document.getElementById("someId").innerHTML=request.responseText;    
    }
}

</script>