<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Seja bem vindo!</title>
  </head>
  <body>
    <h1>Seja bem vindo!</h1>
    <p><a href="<s:url action='mensagem'/>">Projeto Exames</a></p>
    <h2><s:property value="mensagem.mensagem" /></h2>
  </body>
</html>