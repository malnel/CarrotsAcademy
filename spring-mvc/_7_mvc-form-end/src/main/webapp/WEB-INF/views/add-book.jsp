<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
</head>
<body>
<h3>Add book</h3>
<form:form method="POST"
           action="/mvc-form/books/process-form" modelAttribute="book">
    <table>
        <tr>
            <td><form:label path="id">Id</form:label></td>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <td><form:label path="title">Title</form:label></td>
            <td><form:input path="title"/></td>
        </tr>
        <tr>
            <td><form:label path="isbn">ISBN</form:label></td>
            <td><form:input path="isbn"/></td>
        </tr>
        <tr>
            <td><form:label path="author">Author</form:label></td>
            <td><form:input path="author"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>