<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div align="center">
인간관계
</div>
<table border="1">
  <thead>
    <tr>
      <th>이 름</th>
      <th>나 이</th>
      <th>직 업</th>
      <th>관 계</th>
      <th>특 징</th>
    </tr>
  </thead>
  <tbody>

    <c:forEach var="list" items="${List}">
      <tr>
        <td>${list.name}</td>
        <td>${list.age}</td>
        <td>${list.job}</td>
        <td>${list.relation}</td>
        <td>${list.forme}</td>
      </tr>
    </c:forEach>
  </tbody>
</table>