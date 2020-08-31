<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Exames</title>
</head>
<body>
	<h1>Cadastro de Exames</h1>
	<form>
		<div class="form-control">
		       <label for="save_personBean_gendermale">Descrição</label> 
			   <input type="text" name="exame.exmDescricao"
				id="descricao" value="descricao" /> 
				<label for="save_valor">Valor</label> 
				<input type="text" name="exame.exmValor" id="valor"
				value="female" />
		</div>
	</form>
</body>
</html>