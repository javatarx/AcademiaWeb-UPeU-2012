<%@include file="/common/taglibs.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>BambooLabs - myClinic | Login</title>
<link rel="stylesheet" type="text/css" href="resources/css/upeu.css" />
</head>
<body>

	<div id="contenedor">
		<div id="back">
			<div id="fondo">
				<form:form commandName="login">
					<div id="title">
						my<span>Clinic </span><br />
						<span class="texto">versi&oacute;n 2.0.0</span><br />
						<br /> <span class="texto">Ingrese su Usuario: </span>
						<form:input path="login"/>
						<form:errors cssClass="error" path="login" />
							<br /> <span
							class="texto">Ingrese su Password:</span>
						<form:input path="passwd" />
						<form:errors cssClass="error" path="passwd" />
						<br />
						<br />
						<div class="centrado">
							<input type="submit" value="Ingresar" class="button" />
						</div>
						<span class="error">
						<form:errors cssClass="error" path="mensaje" />
						</span>
					</div>
				</form:form>
			</div>
		</div>

		<div id="footer_login">
			<div class="left">&copy; Copyright, Todos los Derechos
				Reservados 2012</div>
			<div class="right">
				<img src="resources/images/logo.png" alt="BambooLabs" width="60%"  height="95%"/><br />Powered by <a
					href="https://www.facebook.com/BambooLab">BambooLab</a>
			</div>
		</div>
	</div>

</body>
</html>
