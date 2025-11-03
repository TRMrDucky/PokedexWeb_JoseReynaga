<!DOCTYPE html>
<html lang="es">
  <head>
    <title>Start Page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  </head>
  <body>
    <h1>¿Quién es ese Pokémon?</h1>
    <form action="/registrar" method="post">
        <div id="seccion-nombre">
        <label for="nombre">Nombre del Pokémon:</label>
        <input type="text" name="nombre" placeholder="Nombre del Pokémon" />
      </div>
      <div id="seccion-numero">
        <label for="numero">Número del Pokémon en la Pokédex:</label>
        <input
          type="text"
          name="numero"
          placeholder="Número del Pokémon en la Pokédex"
        />
      </div>
      <div id="seccion-tipo1">
        <label for="tipo1">Primer Tipo del Pokémon:</label>
        <input
          type="text"
          name="tipo1"
          placeholder="Primer Tipo del Pokémon"
        />
      </div>
      <div id="seccion-tipo2">
        <label for="tipo2">Segundo Tipo del Pokémon (opcional):</label>
        <input
          type="text"
        name="tipo2"
        placeholder="Segundo Tipo del Pokémon (opcional)"
      />
      <div id="seccion-url">
        <label for="url">Enlace a imagen del Pokémon:</label>
        <input type="text" name="url" placeholder="Enlace a imagen del Pokémon" />
      </div>
        <div>
            <button type="submit">Registrar Pokémon</button>
    </form>
  </body>
</html>
