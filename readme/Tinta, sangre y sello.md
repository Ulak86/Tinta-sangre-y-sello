# Proyecto

## Enunciado


Raza

====

tipo

fuerza

resistencia

velocidad

magia

  

Criatura

========

nombre

nivel o experiencia

escudos |

armas | --> serán colecciones (pensar si de clases o de interfaces)

pociones |

puntosVida

  

atacar() --> dado10 * nivel + puntos armas + (raza)

defender() --> dado10 * nivel + puntos escudos + (raza)

  

Juego

================================

Historia con n capítulos, en cada capitulo se darán una serie de eventos en los que el usuario puede decidir,

esos eventos podrán quitar puntos (una trampa) dar puntos (vida extra o poción) o que no pase nada,

una vez pasen los eventos el grupo se enfrentará al "monstruo final" del capítulo.

(Para lo que ocurre en los eventos se puede simular tirando un dado de 20)

  

Se pasará al siguiente capítulo una vez el grupo de guerreros haya finalizado.

Si algún miembro del grupo sobrevive. Por cada capítulo que se pase las criaturas irán ganando puntos.

  

Se tiene que limitar los valores máximos de ataque y defensa que se puede dar a las criaturas (se verá con excepciones)

  

Se generará una librería que se meterá en un proyecto y

me permitirá crear mi propia criatura y ponerle escudos y armas.

Se dará acceso a un método que iniciará el juego y

al que le puedo pasar una o varias criaturas poniendo un máximo de 3 criaturas.


---

## Razas
### Razas y rangos de atributos

| Raza             | Fuerza | Resistencia | Velocidad | Magia  | Descripción breve                                         |
| ---------------- | ------ | ----------- | --------- | ------ | --------------------------------------------------------- |
| **Funcionario**  | 3 - 6  | 7 - 10      | 2 - 5     | 4 - 7  | Paciente, resistente, buena burocracia, poca agilidad.    |
| **Político**     | 4 - 7  | 4 - 7       | 4 - 7     | 7 - 10 | Influencia y carisma altos, fuerza física baja.           |
| **Ciudadano**    | 5 - 8  | 5 - 8       | 5 - 8     | 3 - 6  | Equilibrado, con capacidades medias en todo.              |
| **Manifestante** | 6 - 9  | 4 - 7       | 7 - 10    | 3 - 5  | Rápidos y fuertes en protesta, magia baja.                |
| **Periodista**   | 3 - 5  | 3 - 5       | 8 - 10    | 6 - 9  | Muy ágiles, buena magia informativa, poca fuerza.         |
| **Ministro**     | 4 - 6  | 5 - 8       | 3 - 5     | 8 - 10 | Alta magia política, resistencia decente, baja velocidad. |
| **Autónomo**     | 5 - 7  | 5 - 7       | 5 - 7     | 4 - 6  | Autónomo medio, con capacidades balanceadas.              |
| **Juez**         | 4 - 6  | 6 - 9       | 3 - 5     | 7 - 9  | Alta resistencia y magia judicial, poca agilidad.         |
| **Sindicalista** | 6 - 8  | 6 - 8       | 5 - 7     | 5 - 7  | Fuerza y resistencia fuertes, magia moderada.             |
| **Cayetano**     | 2 - 4  | 4 - 6       | 4 - 6     | 6 - 8  | Baja fuerza, algo de magia social, velocidad media.       |

---

### Ejemplo de cómo interpretar los rangos:

- Un **Funcionario** típico puede tener:
    
    - Fuerza = 4
        
    - Resistencia = 8
        
    - Velocidad = 3
        
    - Magia = 5
        
- Un **Manifestante** podría tener:
    
    - Fuerza = 7
        
    - Resistencia = 6
        
    - Velocidad = 9
        
    - Magia = 4
## Jefes
### 1. **La Burocracia Viviente**

**Descripción:**  
Una enorme masa de papeleo, sellos y formularios interminables que bloquea el paso y ralentiza cualquier intento de avance. Sus ataques son lentos pero desgastan la moral y la energía.

**Estadísticas base:**

|Atributo|Valor|
|---|---|
|Fuerza|6|
|Resistencia|10|
|Velocidad|2|
|Magia|3|
|Puntos de Vida|120|
|Nivel|5|
|Ataque base|dado10 * 5 + 6|
|Defensa base|dado10 * 5 + 10|

**Ataques especiales:**

- **Traba administrativa:** Reduce la velocidad del grupo en 2 puntos durante 2 turnos.
    
- **Sobrecarga de formularios:** Inflige daño continuo de 5 puntos por turno durante 3 turnos.
    

---

### 2. **El Caso de Corrupción**

**Descripción:**  
Un ser sombrío que utiliza sobornos, chantajes y redes de influencia para minar la cohesión y fuerza del grupo. Puede robar recursos y debilitar aliados.

**Estadísticas base:**

|Atributo|Valor|
|---|---|
|Fuerza|5|
|Resistencia|7|
|Velocidad|5|
|Magia|8|
|Puntos de Vida|100|
|Nivel|6|
|Ataque base|dado10 * 6 + 5|
|Defensa base|dado10 * 6 + 7|

**Ataques especiales:**

- **Soborno:** Roba 1 poción o recurso del grupo (si está disponible).
    
- **Chantaje:** Reduce temporalmente el nivel o experiencia de una criatura enemiga en 1 punto durante 2 turnos.
    
- **Red de complicidades:** Aumenta su defensa en +3 durante 3 turnos.
    

---

### 3. **La Bestia de Hacienda**

**Descripción:**  
Un titán implacable que exige pagos y sanciones sin tregua. Sus ataques agotan la salud y los recursos financieros del grupo, generando estrés y fatiga.

**Estadísticas base:**

|Atributo|Valor|
|---|---|
|Fuerza|7|
|Resistencia|9|
|Velocidad|4|
|Magia|6|
|Puntos de Vida|130|
|Nivel|7|
|Ataque base|dado10 * 7 + 7|
|Defensa base|dado10 * 7 + 9|

**Ataques especiales:**

- **Multa abrumadora:** Inflige daño directo de 15 puntos, ignorando la defensa.
    
- **Exacción fiscal:** Reduce la cantidad de pociones disponibles en el grupo en 1.
    
- **Recaudación implacable:** Se regenera 10 puntos de vida al inicio de su turno.

### 4. **La Ley Mordaza**

**Descripción:**  
Una criatura que limita y restringe las acciones del grupo, reduciendo su capacidad para actuar libremente. Su presencia genera miedo y autocensura, dificultando la ejecución de planes y estrategias.

**Estadísticas base:**

|Atributo|Valor|
|---|---|
|Fuerza|5|
|Resistencia|8|
|Velocidad|5|
|Magia|7|
|Puntos de Vida|110|
|Nivel|6|
|Ataque base|dado10 * 6 + 5|
|Defensa base|dado10 * 6 + 8|

**Ataques especiales:**

- **Restricción de movimiento:** Reduce la velocidad del grupo en 3 puntos durante 2 turnos.
    
- **Censura paralizante:** Impide que una criatura use habilidades especiales durante 1 turno.
    
- **Miedo institucional:** Reduce la precisión del grupo en ataques durante 2 turnos.
    

---

### 5. **El Monstruo Mediático**

**Descripción:**  
Este ente distorsiona la verdad y genera caos a través de noticias falsas y manipulación informativa. Afecta la moral del grupo y puede confundirlos, haciendo que fallen sus acciones.

**Estadísticas base:**

|Atributo|Valor|
|---|---|
|Fuerza|4|
|Resistencia|6|
|Velocidad|8|
|Magia|10|
|Puntos de Vida|105|
|Nivel|7|
|Ataque base|dado10 * 7 + 4|
|Defensa base|dado10 * 7 + 6|

**Ataques especiales:**

- **Desinformación:** Confunde a una criatura enemiga, que puede atacar a un aliado por error durante 1 turno.
    
- **Caos mediático:** Reduce la defensa del grupo en 4 puntos durante 2 turnos.
    
- **Manipulación emocional:** Baja la moral, causando que el grupo reciba un daño extra del 10% por 3 turnos.
    

---

### 6. **El Fantasma del Déficit**

**Descripción:**  
Una presencia invisible que consume lentamente los recursos y la energía vital del grupo, haciendo que sus acciones sean cada vez más difíciles y costosas.

**Estadísticas base:**

|Atributo|Valor|
|---|---|
|Fuerza|3|
|Resistencia|7|
|Velocidad|6|
|Magia|9|
|Puntos de Vida|95|
|Nivel|6|
|Ataque base|dado10 * 6 + 3|
|Defensa base|dado10 * 6 + 7|

**Ataques especiales:**

- **Drenaje gradual:** Resta 5 puntos de vida al grupo cada turno durante 4 turnos.
    
- **Consumo de recursos:** Reduce la cantidad de pociones disponibles en 1 por turno durante 3 turnos.
    
- **Agotamiento:** Reduce temporalmente el nivel de todas las criaturas enemigas en 1 punto durante 2 turnos.

### 7. **El Titán de la Deuda Pública**

**Descripción:**  
Un coloso gigantesco que crece con cada capítulo, aplastando a los jugadores bajo una montaña de obligaciones financieras imposibles de pagar.

**Estadísticas base:**

|Atributo|Valor|
|---|---|
|Fuerza|9|
|Resistencia|10|
|Velocidad|3|
|Magia|5|
|Puntos de Vida|150|
|Nivel|8|
|Ataque base|dado10 * 8 + 9|
|Defensa base|dado10 * 8 + 10|

**Ataques especiales:**

- **Carga aplastante:** Inflige daño masivo (20 puntos) ignorando parte de la defensa.
    
- **Aumento de intereses:** Cada turno aumenta su daño en +5 puntos acumulables.
    
- **Presión financiera:** Reduce la recuperación de puntos de vida del grupo en 50% durante 3 turnos.
    

---

### 8. **El Juez Implacable**

**Descripción:**  
Un ser inflexible que juzga y castiga sin piedad, poniendo a prueba la resistencia y moral del grupo con sus sentencias severas.

**Estadísticas base:**

|Atributo|Valor|
|---|---|
|Fuerza|7|
|Resistencia|9|
|Velocidad|4|
|Magia|8|
|Puntos de Vida|130|
|Nivel|7|
|Ataque base|dado10 * 7 + 7|
|Defensa base|dado10 * 7 + 9|

**Ataques especiales:**

- **Sentencia definitiva:** Inflige daño crítico que duplica el daño base en un turno.
    
- **Inhabilitación:** Impide que una criatura use armas o escudos durante 2 turnos.
    
- **Desgaste judicial:** Reduce la defensa del grupo en 5 puntos durante 3 turnos.
    

---

### 9. **La Sombra del Sindicalismo Radical**

**Descripción:**  
Una fuerza disruptiva que provoca disturbios y conflictos internos, afectando la cohesión y comunicación del grupo.

**Estadísticas base:**

|Atributo|Valor|
|---|---|
|Fuerza|8|
|Resistencia|7|
|Velocidad|6|
|Magia|6|
|Puntos de Vida|120|
|Nivel|7|
|Ataque base|dado10 * 7 + 8|
|Defensa base|dado10 * 7 + 7|

**Ataques especiales:**

- **División interna:** Reduce la coordinación del grupo, bajando la precisión en 10% durante 3 turnos.
    
- **Protesta violenta:** Inflige daño en área (10 puntos) a todos los miembros del grupo.
    
- **Sabotaje:** Desactiva una poción o arma durante 1 turno.
    

---

### 10. **El Espectro del Desempleo**

**Descripción:**  
Un enemigo que debilita la esperanza y las habilidades del grupo, causando desánimo y disminuyendo su capacidad de actuar.

**Estadísticas base:**

|Atributo|Valor|
|---|---|
|Fuerza|4|
|Resistencia|6|
|Velocidad|7|
|Magia|9|
|Puntos de Vida|100|
|Nivel|6|
|Ataque base|dado10 * 6 + 4|
|Defensa base|dado10 * 6 + 6|

**Ataques especiales:**

- **Desánimo general:** Reduce la fuerza y velocidad de todas las criaturas enemigas en 2 puntos durante 2 turnos.
    
- **Parálisis laboral:** Impide que una criatura use pociones o habilidades especiales durante 1 turno.
    
- **Fatiga acumulada:** Inflige daño progresivo (5 puntos adicionales cada turno durante 3 turnos).

---

## Capítulo 1: La Tormenta Inicial

### Jefe final: La Burocracia Viviente

_Una entidad enorme y lenta que aplasta con formularios interminables y trámites imposibles._

---

### Evento 1: Colapso en la Administración Local

Una protesta ciudadana ha bloqueado el acceso al registro civil y a la sede de urbanismo. Necesitáis pasar, pero todo está paralizado.

#### Opción A: Esperar en la cola pacientemente

- Consecuencias:
    
    - +1 punto de experiencia (por paciencia).
        
    - El grupo pierde 1 turno en el siguiente combate.
        
    - Cada criatura recibe +2 puntos de vida por evitar enfrentamientos.
        

#### Opción B: Sobornar a un funcionario

- Consecuencias:
    
    - Pérdida de 1 poción aleatoria del inventario (como “soborno”).
        
    - Avanzáis inmediatamente sin penalización de tiempo.
        
    - -1 a la moral del grupo (puede afectar eventos sociales futuros).
        

#### Opción C: Entrar por la fuerza

- Consecuencias:
    
    - Se activa un mini-combate contra 2 Agentes de Seguridad Privada (estadísticas simples).
        
    - Si ganan: obtienen una poción extra y +1 experiencia.
        
    - Si pierden: -5 puntos de vida y no obtienen recompensa.
        

---

### Evento 2: Archivo Perdido en el Laberinto de Documentos

Según la opción anterior, llegáis a la siguiente sala donde debéis encontrar un documento sellado. Todo está clasificado, duplicado o perdido.

---

#### Si elegiste Esperar en la cola (Evento 1A):

##### Opción A1: Seguir el protocolo paso a paso

- -2 puntos de velocidad (por pérdida de tiempo).
    
- +1 punto de resistencia (por disciplina).
    
- Obtienes una autorización que da +2 defensa en el combate final.
    

##### Opción A2: Pedir ayuda a un funcionario simpático

- Lanzar dado de 20:
    
    - 15 o más: obtienes el documento y +1 experiencia.
        
    - Menos de 15: pierdes 1 turno en el siguiente combate.
        

##### Opción A3: Revisar los archivos uno a uno

- Resta 3 puntos de vida (agotamiento).
    
- Encuentras una poción olvidada entre los papeles.
    

---

#### Si elegiste Sobornar (Evento 1B):

##### Opción B1: Hacerte pasar por personal interno

- Lanzar dado de 20:
    
    - 10 o más: éxito total, obtienes +1 arma administrativa.
        
    - Menos de 10: te descubren, recibes -2 vida y alarma activada en el combate final.
        

##### Opción B2: Destruir documentos “confidenciales”

- Evitas combate, pero recibes -1 experiencia (acto cuestionable).
    
- El jefe final tendrá -1 defensa por falta de respaldo documental.
    

##### Opción B3: Contratar a un gestor clandestino

- Pierdes una poción.
    
- Ganas una carta “Recurso de Alegación” (+5 defensa en un turno a elección).
    

---

#### Si elegiste Entrar por la fuerza (Evento 1C):

##### Opción C1: Interrogar a un funcionario encerrado

- Lanzar dado de 20:
    
    - 12 o más: revela una debilidad del jefe final (-5 PV iniciales).
        
    - Menos de 12: se resiste y activa una trampa (-3 PV al grupo).
        

##### Opción C2: Prender fuego a los archivos

- Inicias el combate final inmediatamente, sin opciones de descanso.
    
- El jefe final empieza con -2 en magia (sin documentos).
    

##### Opción C3: Robar el sello oficial

- Requiere éxito en tirada de sigilo (dado de 20 ≥ 14).
    
- Si logras robarlo: el grupo gana +2 ataque en el primer turno del jefe final.
    
- Si fallas: empieza el combate con -1 defensa por caos interno.
    

---

## Enfrentamiento final: La Burocracia Viviente

### Descripción narrativa

Tras sobrevivir al colapso administrativo y encontrar (o no) el documento perdido, el grupo se encuentra en el corazón del Ministerio: una sala interminable con archivadores rodantes, escritorios desordenados y pantallas que parpadean con mensajes automáticos de "Falta documento XYZ. Reinicie el trámite."

Del centro emerge **La Burocracia Viviente**, una criatura de papel, sellos, cables telefónicos y pantallas CRT, con múltiples brazos que reparten formularios como látigos.

---

### Estadísticas base del jefe: La Burocracia Viviente

|Atributo|Valor|
|---|---|
|Fuerza|6|
|Resistencia|10|
|Velocidad|2|
|Magia|3|
|Nivel|5|
|Puntos de Vida|120|
|Ataque Base|dado10 * 5 + 6|
|Defensa Base|dado10 * 5 + 10|

---

### Habilidades especiales

#### Formulario Infinito (cada 3 turnos)

- Lanza un formulario por cada miembro del grupo.
    
- Cada jugador debe tirar dado de 20:
    
    - < 10: pierde su acción ese turno.
        
    - ≥ 10: puede actuar normalmente.
        

#### Traba Administrativa (una vez activado el 50% de sus PV)

- Reduce la **velocidad** del grupo en -2 por el resto del combate.
    

#### Requisito Imposible

- Elige al azar una criatura y lanza dado de 20:
    
    - < 12: pierde 1 turno buscando un "certificado inexistente".
        
    - ≥ 12: ignora el ataque.
        

#### Duplicado no válido (pasiva)

- Cada vez que recibe más de 20 puntos de daño en un turno, regenera 5 PV (el sistema “corrige el error”).
    

---

### Bonus por decisiones previas

|Evento|Resultado|
|---|---|
|Opción 1A → 2A1|+2 defensa durante todo el combate (por tener autorización).|
|Opción 1B → 2B2|Jefe comienza con -1 defensa (faltan documentos).|
|Opción 1C → 2C1|Jefe empieza con -5 PV (debilidad revelada).|
|Opción 1C → 2C3|Grupo gana +2 ataque en el primer turno (robo del sello).|
|Opción 2B3|Puedes usar “Recurso de Alegación”: +5 defensa durante 1 turno.|

---

### Recompensas tras la victoria

- Cada criatura gana **+2 experiencia**.
    
- El grupo encuentra un **Archivo Legendario**, que puede ser:
    
    - Una poción especial (+15 PV).
        
    - Un arma “Tintero de Poder” (+2 ataque mágico).
        
    - Un **Sello Oficial** (reduce daño recibido de enemigos con tipo “Gobierno” en futuros capítulos).
        

---

## Capítulo 2: Las Sombras del Poder

### Jefe final: El Caso de Corrupción

Un ser sombrío que utiliza sobornos, chantajes y redes de influencia para minar la cohesión y fuerza del grupo.

---

### Evento 1: Redes Ocultas en la Ciudad

El grupo descubre que existe una trama de corrupción que infiltra instituciones clave. Deben decidir cómo actuar para impedir que las redes se propaguen.

#### Opción A: Infiltrarse discretamente en la reunión secreta

- Consecuencias:
    
    - Lanzar dado de 20:
        
        - ≥ 14: consiguen información valiosa → +1 experiencia + obtienen “Documento Comprometedor” (daño adicional al jefe).
            
        - < 14: son descubiertos → -2 puntos de vida + ganan enemistad del sistema (desventaja futura).
            
    - Si tienen éxito: ganan +1 defensa provisional para el combate final.
        

#### Opción B: Denunciar públicamente el escándalo

- Consecuencias:
    
    - Riesgo de represalias mediáticas: lanzar dado de 20
        
        - ≥ 12: la presión social debilita al jefe (−2 defensa inicial).
            
        - < 12: contragolpe: cada criatura recibe −3 puntos de vida.
            
    - Ganan +1 moral de grupo si el escándalo calará.
        

#### Opción C: Sobornar funcionarios filtradores

- Consecuencias:
    
    - Pérdida de 1 poción o recurso
        
    - Si lanzan dado de 20 ≥ 13: obtienen protección temporal: +2 resistencia durante el combate final.
        
    - Si fallan: pierden un turno al ser descubiertos.
        

---

### Evento 2: Chantaje Personal

Los miembros del grupo son blanco de amenazas individuales: pueden recibir chantajes, revelar secretos o ser sobornados.

#### Si eligieron Infiltrarse (Evento 1A):

##### Opción A1: Mostrar pruebas recopiladas

- Consecuencias:
    
    - Todos los chantajes pierden fuerza → −1 nivel de debilidad al jefe.
        
    - Ganan +1 experiencia adicional.
        

##### Opción A2: Ocultar parte de la información para proteger reputaciones

- Consecuencias:
    
    - Lanzar dado de 20
        
        - ≥ 15: evitan daño y mantienen reputación → +1 defensa extra en primer turno.
            
        - < 15: alguno de los chantajes tiene efecto: una criatura sufre −2 vida extra.
            

##### Opción A3: Enfrentar el chantajista con fuerza

- Consecuencias:
    
    - Mini enfrentamiento contra 1 “Agente del Chantaje”
        
        - Si ganan: recuperan la información completa y +1 poción
            
        - Si pierden: −3 vida + no obtienen beneficio
            

---

#### Si eligieron Denunciar (Evento 1B):

##### Opción B1: Liberar comunicados con pruebas

- Consecuencias:
    
    - Lanzar dado de 20
        
        - ≥ 13: consiguen respaldo público → +2 defensa durante el combate final
            
        - < 13: campañas de desinformación se activan → −1 ataque del grupo
            

##### Opción B2: Presentar denuncia formal

- Consecuencias:
    
    - Pierden 1 turno extra (burocracia)
        
    - Si lanzan dado de 20 ≥ 14: las autoridades investigan → jefe comienza con −2 PV
        
    - Si falla: el jefe gana +1 defensa adicional como reacción
        

##### Opción B3: Retirar la denuncia antes de reaccionar

- Consecuencias:
    
    - Evitan contragolpe, pero pierden 1 experiencia
        
    - No obtienen ventajas para el combate final
        

---

#### Si eligieron Sobornar (Evento 1C):

##### Opción C1: Usar intermediarios anónimos

- Consecuencias:
    
    - Lanzar dado de 20
        
        - ≥ 13: protección encubierta exitosa → +1 velocidad durante combate
            
        - < 13: los chantajes se filtran → cada criatura recibe −2 vida
            

##### Opción C2: Amenazar a los filtradores

- Consecuencias:
    
    - Pérdida de 1 recurso
        
    - Lanzar dado de 20
        
        - ≥ 14: callan los filtradores → jefe empieza con −1 ataque
            
        - < 14: los filtradores reaccionan → grupo pierde 1 turno
            

##### Opción C3: Comprar silencio parcial

- Consecuencias:
    
    - Gastan 1 poción
        
    - Si lanzan dado de 20 ≥ 12: reducen impacto del chantaje → una criatura no sufre efectos
        
    - Si falla: el chantaje afecta completamente → −3 vida para una criatura
        

---

## Enfrentamiento final: El Caso de Corrupción

### Estadísticas base del jefe: El Caso de Corrupción

|Atributo|Valor|
|---|---|
|Fuerza|5|
|Resistencia|7|
|Velocidad|5|
|Magia|8|
|Nivel|6|
|Puntos de Vida|100|
|Ataque Base|dado10 * 6 + 5|
|Defensa Base|dado10 * 6 + 7|

---

### Habilidades especiales

1. **Soborno**
    
    - Resta 1 poción o recurso del grupo si está disponible.
        
2. **Chantaje**
    
    - Reduce temporalmente el nivel o experiencia de una criatura en 1 punto durante 2 turnos.
        
3. **Red de complicidades**
    
    - Aumenta su defensa en +3 durante 3 turnos cuando lo active.
        

---

### Bonus por decisiones previas

|Evento|Resultado|
|---|---|
|Opción 1A → 2A1|Jefe comienza con −1 nivel de coherencia (daño menor)|
|Opción 1B → 2B1|Grupo obtiene +2 defensa en turno inicial|
|Opción 1C → 2C2|Jefe empieza con −1 ataque|
|Opción 2A3|Ganan +1 poción adicional|
|Opción 2B3|Jefe comienza con +1 defensa como represalia|

---

### Recompensas tras la victoria

- Cada criatura gana **+3 experiencia**.
    
- El grupo obtiene un **Ítem de Influencia**: puede ser
    
    - Un “Firmante Oculto” (+2 ataque diplomático)
        
    - Una “Lista Negra” (reducir defensa de “Gobierno” en futuros capítulos)
        
    - Una poción de restauración mayor (+20 PV)

## Capítulo 3: El Confrontamiento Final con la Bestia de Hacienda

### Jefe final: La Bestia de Hacienda

Un titán implacable que exige pagos, intereses y sanciones sin tregua. Su presencia consume energía y recursos, y su poder se ha intensificado con cada capítulo.

---

### Evento 1: El Ataque del Ejecutivo Fiscal

Justo antes de que comience el enfrentamiento, el grupo es atacado por emisarios del jefe: inspectores armados que intentan debilitarles antes de la batalla.

#### Opción A: Defenderse con todo

- Se inicia un combate preliminar contra 2 inspectores fiscales (estadísticas moderadas).
    
- Si ganan: recuperan 1 poción y ganan +1 experiencia.
    
- Si pierden: pierden −5 puntos de vida en total y no obtienen beneficios.
    

#### Opción B: Evadir el encuentro

- Lanzar dado de 20:  
      ‑ ≥ 13: evitan el enfrentamiento, sin daño adicional.  
      ‑ < 13: uno de los inspectores les embosca → cada criatura pierde −2 vida.
    

#### Opción C: Atacar directamente al núcleo financiero

- Intentan golpear el sistema de soporte del jefe (servidores fiscales).
    
- Lanzar dado de 20:  
      ‑ ≥ 15: logran un debilitamiento: el jefe comienza el combate con −10 PV.  
      ‑ < 15: desencadenan una trampa financiera → grupo pierde −3 vida atravesada + la batalla comienza inmediatamente.
    

---

### Evento 2: El Juicio de los Intereses

Mientras se preparan para combatir, surgen cargos contra el grupo: el sistema fiscal dicta sentencias automáticas. Deben actuar rápido.

#### Si eligieron Defenderse (Evento 1A):

##### Opción A1: Presentar defensa legal

- Ganan +1 resistencia temporal.
    
- Lanzar dado de 20:  
      ‑ ≥ 14: el juicio falla en su contra → el jefe gana +2 defensa.  
      ‑ < 14: el grupo gana ventaja legal → el jefe inicia con −2 ataque.
    

##### Opción A2: Aceptar pago simbólico

- Pierden 1 poción como “fianza”.
    
- El jefe comienza con −5 PV (por reducción de presión legal).
    

---

#### Si eligieron Evadir (Evento 1B):

##### Opción B1: Contratar defensa externa

- Gastan 1 poción.
    
- Si dado de 20 ≥ 13: se obtiene protección legal → jefe comienza con −1 defensa.
    
- Si falla: el sistema penaliza → grupo pierde −2 vida adicional.
    

##### Opción B2: Desafiar el sistema públicamente

- Lanzar dado de 20:  
      ‑ ≥ 15: escándalo masivo → el jefe pierde −8 PV.  
      ‑ < 15: el sistema reacciona → cada criatura pierde −3 vida.
    

---

#### Si eligieron Atacar el núcleo (Evento 1C):

##### Opción C1: Sabotear datos fiscales

- Lanzar dado de 20:  
      ‑ ≥ 14: éxito → jefe inicia con −1 turno.  
      ‑ < 14: activan alarmas → el jefe gana +2 ataque inicial.
    

##### Opción C2: Difundir filtraciones masivas

- Pierden 1 arma como costo reputacional.
    
- Si dado de 20 ≥ 13: el jefe inicia con −2 defensa.
    
- Si falla: la estrategia se vuelve en su contra → grupo pierde −4 vida.
    

---

## Enfrentamiento final definitivo: La Bestia de Hacienda

### Estadísticas base del jefe

|Atributo|Valor|
|---|---|
|Fuerza|7|
|Resistencia|9|
|Velocidad|4|
|Magia|6|
|Nivel|7|
|Puntos de Vida|130|
|Ataque Base|dado10 * 7 + 7|
|Defensa Base|dado10 * 7 + 9|

---

### Habilidades especiales

1. **Multa Abrumadora**  
      ‑ Inflige 15 puntos directos, ignorando la defensa.
    
2. **Exacción Fiscal**  
      ‑ Reduce el número de pociones del grupo en 1.
    
3. **Recaudación Implacable**  
      ‑ Regenera 10 PV al inicio de cada turno.
    

---

### Bonus por decisiones previas

|Evento|Efecto en el combate final|
|---|---|
|Opción 1A → 2A2|Jefe comienza con −2 ataque|
|Opción 1C que permitió debilitar al jefe|El jefe comienza con −10 PV|
|Opción 1C → C1|El jefe pierde 1 turno al inicio|
|Opción 1B → B2 que provocó escándalo|El jefe comienza con −8 PV|
|Opción 2A1 (defensa legal)|+1 resistencia para el grupo|

---

### Recompensas y desenlace

- Cada criatura gana **+5 experiencia** por la magnitud de la victoria.
    
- El grupo adquiere el **Contrato de Sostenibilidad Fiscal**, que en futuros capítulos:
    
    - Reduce el daño fiscal en un 30 %.
        
    - Otorga un escudo especial contra ataques “financieros”.
        
- Además, como trofeo final, obtienen **La Llave del Tesoro Público**, un artefacto capaz de debilitar la corrupción gobernante:
    
    - Con ella pueden reducir defensa o ataque de cualquier jefe de tipo “Gobierno” en futuros episodios.

## Epílogo: El Silencio Tras la Tormenta

Tras la caída de **la Bestia de Hacienda**, el silencio se extendió por todo el territorio como una niebla densa. Los formularios dejaron de moverse, los sistemas fiscales colapsaron por exceso de lógica, y el aire volvió a sentirse respirable por primera vez en mucho tiempo.

El grupo, herido pero en pie, salió de las ruinas del Ministerio Central con el **Contrato de Sostenibilidad Fiscal** en sus manos y **la Llave del Tesoro Público** colgando de sus mochilas maltrechas. Habían sobrevivido a trampas burocráticas, a manipulaciones mediáticas, y a las garras de una deuda pública interminable.

Las calles, antes vacías y desmoralizadas, comenzaron a llenarse. Los ciudadanos —funcionarios, autónomos, manifestantes y cayetanos por igual— salieron de sus casas y oficinas, con una mezcla de esperanza y confusión. La sombra opresiva del sistema comenzaba a desvanecerse, al menos por un tiempo.

Y aunque la batalla había sido dura, no había triunfalismo. Sabían que el monstruo podía renacer. Que **la corrupción**, **el déficit**, **la censura** o **la desinformación** podrían tomar nuevas formas, más sutiles o más agresivas. Pero también sabían algo más importante:

**Esta vez, estaban preparados.**

Los nombres del grupo se perderían en los archivos del tiempo, como tantas otras luchas olvidadas, pero sus actos resonarían en las decisiones, leyes y levantamientos de los años por venir.

Porque, al final, **el verdadero poder no está en destruir al sistema, sino en sobrevivirlo... y cambiarlo desde dentro.