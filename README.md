<h1>Conversor de Monedas</h1>

<p> Se trata de un programa tipo desktop bastante simple en cuanto a su funcionamiento: tomando cómo base la moneda de curso corriente argentina; le permite al usuario calcular y convertir el monto que ingrese en cada casilla a la moneda que haya seleccionado dentro de las opciones ofrecidas por mí</p>
<p> Inicialmente me gustaría explicar la función que tiene cada una de las clases, y posteriormente profundizar en cada una</p>
<h4>Monedas</h4>
<p> Es el class encargado de almacenar la información de cada moneda ofrecida por el programa. En ella utilicé HashMap en vez de Arrays motivo de que, al ofrecer colocar un nombre y valor a un objeto en una lista, representa un código mas eficente, cómodo de leer y a su vez simplifia la logística de desarrollo</p>
<h4>Panel</h4>
<p>En este se encuentra la parte logística mas compleja y completa de todo mi código, incluyendo en este el fondo del programa, los botones, casillas y funciones de cálculo.</p>
<h5>ComboBox</h5>
<p>La función de estas cajas se centra en brindarle al usuario una forma cómoda de elegir qué monedas usar en sus operaciones; y para ello adquiere los datos del class Monedas, pudiendo enlazar el tipo de moneda seleccionada con un valor, permitiendo un cálculo mas cómodo</p>
<h5>JButton</h5>
<p>Cada uno de ellos corresponden a una necesidad diferente, pues responden a métodos distintos que cumplen su propio objetivo(explicados mas adelante)</p>
<h5>JTextField</h5>
<p>Estas casillas están creadas para que el usuario pueda colocar en ellas el monto que tiene pensado convertir de una moneda a otra, siendo de los principales elementos del cálculo</p>
<h5>Funciones de cálculo</h5>
<p>Estas dos (funcion 1 y funcion2) utilizan los valores correspondientes a cada TextField (Monto ingresado por el usuario) y el valor adignado a la moneda seleccionada(Para esto utiliza un método que encuentra el tipo de moneda selecionada y absorve su valor. Ejemplo, si la moneda seleccionada es USD; va a buscar en el HasMap su valor asociado, que sería 0.0038), y con estas dos bases crea el cálculo. Este es informado al ususario con una ventana de alerta, que detalla no sólo el resultado sino también le recuerda qué moneda eligió</p>
<h4>Marco</h4>
<p>Cumple la simple pero importante función de brindarle un tamaño, título, ícono y ubicación a la ventana del programa; incluyendo en sí mismo el constructor de Panel, además de claro; hacer que la ventana sea visible</p>
<h4>ConversorDesktop</h4>
<p>La función que cumple es muy simple, pues no hace mas que determinar lo que hace el programa al cerrase.</p>
<h6>Comprendo que este último es innecesario, pero por costumbre me resulta mas cómodo tener una clase de este estilo</h6>
