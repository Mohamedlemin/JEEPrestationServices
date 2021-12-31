<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>client</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
</head>
<body>
<div class="contaire col-md-10 col-md-offset-1">
<div class="contaire">
<div class="panel panel-primary">
<div class="panel-heading">update Client</div>
<div class="panel-body">
<form action="Updateclient.php" method="POST">
<div class="row">
<div class="col-md-6 pr-0">
<div class="form-group form-group-default">
<label>Name</label>
<input name="name" type="text" class="form-control"value="${client.nom}" placeholder="Name">
</div>
																	</div>
																	<div class="col-md-6 pr-0">
																		<div class="form-group form-group-default">
																			<label>Prenom</label>
																			<input name="Prenom" type="text" class="form-control"value="${client.prenom}" placeholder="PRENOM">
																		</div>
																	</div>
																	<div class="col-md-6 pr-0">
																		<div class="form-group form-group-default">
																			<label>Telephone</label>
																			<input name="telephone" type="text" class="form-control"value="${client.telephone}" placeholder="TELEPHONE">
																		</div>
																	</div>
																	<div class="col-md-6 pr-0">
																	<div class="form-group form-group-default">
																			<label>Username</label>
																			<input name="username" type="text" class="form-control"value="${client.username}" placeholder="USERNAME">
																		</div>
																	</div>
																	<div class="col-md-6 pr-0">
																	<div class="form-group form-group-default">
																			<label>Type</label>
																			<input name="type" type="text" class="form-control"value="${client.type}" placeholder="TYPE">
																		</div>
																	</div>
																	<div class="col-md-6 pr-0">
																	<div class="form-group form-group-default">
																			<label>Passeword</label>
																			<input name="passeword" type="text" class="form-control"value="${client.password}" placeholder="TYPE">
																		</div>
																	</div>
																	<input type="hidden" name="id"value="${client.id}"/>
																</div>													
														</div>
														<div class="modal-footer no-bd">
															<button type="submit" id="addRowButton" class="btn btn-primary">EDITER</button>
															<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
														</div></form>

</div>
</div>
<div>
</div>
</body>
</html>