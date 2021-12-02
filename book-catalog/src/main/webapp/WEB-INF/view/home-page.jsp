<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
	<title>Book Catalog Project</title>
	<style><%@include file="/WEB-INF/css/style.css"%></style>
</head>
<body>

	<h1>Welcome to Book Catalog Project</h1>
	
	<div class="container">
	
		<!-- Edit Book Info Section Starts -->
		<section id="edit-book-section">
			<form action="/book-catalog/book/update" method="POST">
				<div class="input-field">
					<label>Book Id</label>
					<input type="number" value="${book.bookId}" name="bookId">
				</div>
				<div class="input-field">
					<label>Book Title</label>
					<input type="text" value="${book.bookTitle}" name="bookTitle">
				</div>
				<div class="input-field">
					<label>Author Name</label>
					<input type="text" value="${book.authorName}" name="authorName">
				</div>
				<div class="input-field">
					<label>Category</label>
					<input type="text" value="${book.category}" name="category">
				</div>
				<button type="submit">Update Book</button>
			</form>
		</section>
		<!-- Edit Book Info Section Ends -->
		
		<!-- Edit Book Info Section Starts -->
		<section id="edit-book-section">
			<form action="/book-catalog/book/add" method="POST">
				<div class="input-field">
					<label>Book Id</label>
					<input type="number" value="${book.bookId}" name="bookId">
				</div>
				<div class="input-field">
					<label>Book Title</label>
					<input type="text" value="${book.bookTitle}" name="bookTitle">
				</div>
				<div class="input-field">
					<label>Author Name</label>
					<input type="text" value="${book.authorName}" name="authorName">
				</div>
				<div class="input-field">
					<label>Category</label>
					<input type="text" value="${book.category}" name="category">
				</div>
				<button type="submit">Add Book</button>
			</form>
		</section>
		<!-- Edit Book Info Section Ends -->

		<!-- Display All Book Section Starts -->
		<section id="all-books-section">
			<div class="grid-wrapper grid-header">
				<p>Book Id</p>
				<p>Title</p>
				<p>Author Name</p>
				<p>Category</p>
				<p>Action</p>
			</div>
				<div class="grid-wrapper">
					<c:forEach var="book" items="${booklist}">
						<p>${book.bookId}</p>
						<p>${book.bookTitle}</p>
						<p>${book.authorName}</p>
						<p>${book.category}</p>
						<div>
							<button onclick="window.location.href='/book-catalog/book/${book.bookId}'" type="button">Edit</button>
							<button type="button">Delete</button>
						</div>
					</c:forEach>
				</div>
		</section>
		<!-- Display All Book Section Ends -->
	
	</div>

</body>
</html>
