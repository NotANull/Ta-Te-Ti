<h1>TaTeTi en consola 🕹</h1>
	<p>El "proyecto" es un juego de ta-te-ti pero en la consola</p>
	<hr>
	<h2>Información 📚</h2>
	<p>Se utilizó una estructura de datos de tipo matriz en donde cada índice se van a guardar datos de tipo char y cada índice de la estructura se inicializa en ' ' (espacio). El tamaño de la estructura es de 3x3, sus índices van de 0 a 2 tanto para las filas como para las columnas</p>
	<table>
		<tr >
			<td>[ ]</td>
			<td>[ ]</td>
			<td>[ ]</td>
		</tr>
		<tr>
			<td>[ ]</td>
			<td>[ ]</td>
			<td>[ ]</td>
		</tr>
		<tr>
			<td>[ ]</td>
			<td>[ ]</td>
			<td>[ ]</td>
		</tr>
	</table>
	<h2>¿Cómo jugar? 🤔</h2>
	<p>En el juego hay 2 modos: uno es para jugar pvp (player vs player) y se deben ingresar los nombres de los jugadores, y el otro es pve (player vs environment) en donde sólo se debe ingresar el nombre del que va a jugar contra el entorno. Cada jugador debe ingresar por teclado el índice de la fila y de la columna a la que quiere ingresar una marca (el jugador 1 tiene las 'X' y el jugador 2 tiene las 'O'). Por ejemplo:</p>
	<ul>
		<li>Turno del jugador 1</li>
		<li>Ingrese fila: 1</li>
		<li>Ingrese columna: 1</li>
	</ul>
	<table>
		<tr >
			<td>[ ]</td>
			<td>[ ]</td>
			<td>[ ]</td>
		</tr>
		<tr>
			<td>[ ]</td>
			<td>[X]</td>
			<td>[ ]</td>
		</tr>
		<tr>
			<td>[ ]</td>
			<td>[ ]</td>
			<td>[ ]</td>
		</tr>
	</table>
	<ul>
		<li>Turno del jugador 2</li>
		<li>Ingrese fila: 0</li>
		<li>Ingrese columna: 0</li>
	</ul>
	<table>
		<tr >
			<td>[O]</td>
			<td>[ ]</td>
			<td>[ ]</td>
		</tr>
		<tr>
			<td>[ ]</td>
			<td>[X]</td>
			<td>[ ]</td>
		</tr>
		<tr>
			<td>[ ]</td>
			<td>[ ]</td>
			<td>[ ]</td>
		</tr>
	</table>
	<p>La partida termina cuando alguno de los 2 jugadores logre juntar 3 marcas horizonal, vertical o diagonalmente. La partida también termina cuando ninguno de los dos jugadores gana y no se puedan hacer más movimientos, en ambos casos se preguntará si se quiere volver a jugar otra partida. Cada vez que se quiera volver a jugar, se acumulan los puntos de cada ronda ganada por un jugador y en el momento de no querer seguir jugando, se informará el ganador con su puntaje</p>
	<h2>Testeos ⚙</h2>
	<p>Se han hecho varios testeos pero todavía queda pulir algunos detalles, entre ellos están:</p>
	<ul>
		<li>Si se ingresa un dato de tipo char en una posición de la fila y/o columna.</li>
		<li>Si se ingresan los mismos nombres en el modo pvp</li>
		<li>Aumentar la dificultad en momento de querer jugar pve</li>
	</ul>
	<p><strong>Puede que haya otros detalles</strong></p>
	<h2>Motivación 💪</h2>
	<p>Es un pequeño proyecto para ir aprendiendo, avanzar y ganar experiencia en el mundo del desarrollo. A medida que pase el tiempo y surgan nuevas ideas es bueno compartirlo con el mundo para también incentivar a otras personas a que ingresen a este hermoso trabajo</p>
