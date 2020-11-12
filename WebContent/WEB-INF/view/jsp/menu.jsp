<link rel="stylesheet" href ="../css/style.css"/>

<div id="nav" class="vmenu">
<a class="menu_link_active" href="Home">Home Page</a>
<a class="menu_link" href="<%=request.getContextPath()%>/file">Link 1</a>
<a class="menu_link" href="#">Link 2</a>
<a class="menu_link" href="#">Link 3</a>
</div>
<script>
//Add active class to the current button higlight it
var header=document.getElementById("nav");
var links = header.getElementsByClassName("menu_link");

   for(var i= 0; i< links.length;i++)
	{
		links[i].addEventListener("click",function(){
          var current = document.getElementsByClassName("active");
          current[0].className = current[0].className.replace(" active", "");
           this.className += " active";
			});
	}
</script>