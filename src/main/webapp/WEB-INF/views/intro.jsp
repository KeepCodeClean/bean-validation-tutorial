<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
    <head></head>

    <style>
        .error {
            color: red;
            padding-top: 5px;
        }
    </style>

    <body>
    
        <form:form method="POST"
                   action="/employee" modelAttribute="employee">
            <table>
                <tr>
                    <td><form:label path="id">ID</form:label></td>
                    <td><form:input path="id" /></td>
                    <td><form:errors path="id" cssClass="error"/></td>
                </tr>
                <tr>
                    <td><form:label path="name">Name</form:label></td>
                    <td><form:input path="name" /></td>
                    <td><form:errors path="name" cssClass="error"/></td>
                </tr>
                <tr>
                    <td><form:label path="age">Age</form:label></td>
                    <td><form:input  path="age" /></td>
                    <td><form:errors path="age" cssClass="error"/></td>
                </tr>
                <tr>
                    <td><form:label path="email">Email</form:label></td>
                    <td><form:input path="email" /></td>
                    <td><form:errors path="email" cssClass="error"/></td>
                </tr>
                <tr>
                    <td><form:label path="phoneNumber">Phone number</form:label></td>
                    <td><form:input path="phoneNumber" /></td>
                    <td><form:errors path="phoneNumber" cssClass="error"/></td>
                </tr>
                <tr>
                    <td><form:label path="password">Password</form:label></td>
                    <td><form:input path="password" /></td>
                    <td><form:errors path="password" cssClass="error"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>