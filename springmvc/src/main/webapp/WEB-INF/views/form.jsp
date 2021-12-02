<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
  
  <div class="container mt-4">
    <form action="submitform" method="post">
    <h3>Registration Form</h3>
    <div class="alert alert-danger" role="alert">
	  <form:errors path="emp.*"></form:errors>
	</div>
    <hr>
    	<div class="mb-3">
		    <label for="exampleInputName" class="form-label">Name</label>
		    <input type="text" class="form-control" id="exampleInputName" name="name" aria-describedby="emailHelp" placeholder="Enter name">
		 </div>
    	<div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label">Your Id</label>
		    <input type="text" class="form-control" id="exampleInputEmail1" name="id" aria-describedby="emailHelp" placeholder="Enter Id">
		 </div>
		 <div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label">Date Of Birth</label>
		    <input type="text" class="form-control" id="exampleInputEmail1" name="dob" aria-describedby="emailHelp" placeholder="Enter Date of birth">
		 </div>
		 
		 <select class="form-select mb-3" multiple aria-label="multiple select example" name="courses">
			  <option selected>Open this select menu</option>
			  <option >One</option>
			  <option >Two</option>
			  <option >Three</option>
			</select>
			<div class="mb-3">
			<label class="form-label ">Select Gender</label>
		  <div class="form-check">
			  <input class="form-check-input" type="radio" name="gender" value="male" id="flexRadioDefault1">
			  <label class="form-check-label" for="flexRadioDefault1">
			    male
			  </label>
			</div>
			<div class="form-check">
			  <input class="form-check-input" type="radio" name="gender" value="female" id="flexRadioDefault2">
			  <label class="form-check-label" for="flexRadioDefault2">
			    female
			  </label>
			</div>
			</div>
			
			<div class="mb-3">
		    <label for="exampleInputName" class="form-label">Street</label>
		    <input type="text" class="form-control" id="exampleInputName" name="address.street" aria-describedby="emailHelp" placeholder="Enter street">
		 </div>
    	<div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label">City</label>
		    <input type="text" class="form-control" id="exampleInputEmail1" name="address.city" aria-describedby="emailHelp" placeholder="Enter city">
		 </div>
		  <button type="submit" class="btn btn-primary">Submit</button>
    
    </form>
    </div>

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
  </body>
</html>