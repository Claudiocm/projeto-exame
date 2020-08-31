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
		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="save_personBean_gendermale">Descrição</label> <input
					class="form-control" type="text" name="exame.exmDescricao"
					id="descricao" value="descricao" />
			</div>
			<div class="form-group col-md-6">
				<label for="save_valor">Valor</label> <input type="text"
					class="form-control" name="exame.exmValor" id="valor"
					value="female" />
			</div>
		</div>
		<button type="submit" class="btn btn-primary btn-sm">Salvar</button>
		<button type="reset" class="btn btn-danger btn-sm">Cancelar</button>
	</form>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>