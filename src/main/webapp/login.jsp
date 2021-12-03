<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  <!-- Optional JavaScript; choose one of the two! -->

  <link rel="stylesheet" href="assets/stylesheets/login.css">


  <!-- Option 1: Bootstrap Bundle with Popper -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"
    defer></script>
  <script defer type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
  <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js" defer></script>
  <script defer src="scripts/validacion-login.js"></script>
  <title>Turismo En Tierra Media || Login</title>
</head>

<body class="bg-light">

  <div class="container  ">
    <div class="row vh-100 align-items-center justify-content-center">
      <div class="col-sm-8 pt-1 col-md-6 col-lg-4 bg-white p4 shadow rounded-1">
        <div class="row justify-content-center mb-4">
         <a href="index.jsp" class="ps-3 ms-5"> <img src="assets/img/logo_small.png" alt="logo" 
          class="d-inline-flex pt-1 pb-2 w-75" ></a>
        </div>
        <form class="row g-3 needs-validation" novalidate  action="dashboard.jsp">
          <div class="mb-4">
            <label for="Email" class="form-labe">Email</label>
            <input type="email" class="form-control" id="email" aria-describedby="emailhelp" required>
            <div id="emailhelp" class="form-text">ingrese su correo</div>
          </div>

          <div class="mb-4">
            <label for="password" class="form-labe">Contraseña</label>
            <input type="password" class="form-control" id="password" aria-describedby="passwordhelp" required>
            <div id="passwordhelp" class="form-text">ingrese su Contraseña</div>
          </div>
          <div class="mb-4 form-check">
            <input type="checkbox" class="form-check-input " id="recordar">
            <label for=" recordar" class="form-check-label ">Recordar usuraio </label>
          </div>
          <button type="submit" class="btn btn-primary w-100 mb-2">Ingresar</button>
        </form>
        <p class="mb-0 text-center " style="font-size: 14px;" >Aun no te Registraste? <a href="registro.jsp">Ingresa Ahora!</a></p>
      </div>
    </div>

  </div>



</body>

</html>