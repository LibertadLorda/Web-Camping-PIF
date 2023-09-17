<script setup>
import PolicyComponent from '../components/PolicyComponent.vue'
import {ref} from 'vue'

const dialog= ref(false);
  
</script>

<template>
    <span style="cursor: pointer; text-decoration: underline;" @click="dialog = !dialog">Política de Privacidad</span>

    <v-dialog v-model="dialog" width="800" >
      <v-card>
        <v-card-text @click="dialog = false">
          <PolicyComponent
            title="Política de privacidad"
            content="En cumplimiento de las obligaciones establecidas en la Ley Orgánica 3/2018, de 5 de diciembre, de Protección de Datos Personales y Garantía de los Derechos Digitales se le facilita la información relativa al tratamiento de sus datos personales."
            />
            <v-divider class="divider"></v-divider>

            <PolicyComponent
            title="¿Quién es el responsable del tratamiento de tus datos?"
            content="CAMPING DE BAÑUGUES, S.L.. CIF: B33379850
Domicilio: BAÑUGUES, S/N 33448, GOZON.
Tfno: 985880785
Mail: campingelmolino@hotmail.com
Web: www.campingdebañugues.es

Puedes dirigirte de cualquier forma para comunicarte con nosotros. Nos reservamos el derecho a modificar o adaptar la presente Política de Privacidad en cualquier momento. Te recomendamos revisar la misma, y si te has registrado y accedes a tu cuenta o perfil, se te informará de las modificaciones.
A continuación puede consultar la información sobre como tratamos los datos en función del colectivo al que pertenezca el usuario:"
            />
            <v-divider class="divider"></v-divider>
            
            <PolicyComponent
            title="Huéspedes"
            content="• ¿Con que finalidades vamos a tratar sus datos personales?

Le informamos que sus datos serán tratados con la finalidad de gestionar su reserva, su estancia en el hotel y garantizar el pago de los gastos derivados de dicha estancia. Sus datos serán comunicados a las Fuerzas y Cuerpos de Seguridad en cumplimiento de lo establecido en la legislación vigente, así como a las agencias u operadores de viajes involucrados. Los datos se mantendrán como mínimo durante 6 años en cumplimiento de las normativas fiscal, mercantil, consumo y de libro-registro de viajeros de este sitio web podrían no funcionar correctamente.

• ¿Cuál es la legitimación para el tratamiento de tus datos?

La base legal es tu consentimiento."
            />
            <v-divider class="divider"></v-divider>
            
            <PolicyComponent
            title="Contactos de la web o del correo electrónico"
            content="• ¿Qué datos recopilamos a través de la Web?

Podemos tratar tu IP, qué sistema operativo o navegador usas, e incluso la duración de tu visita, de forma anónima. Si nos facilitas datos en el formulario de contacto, te identificarás para poder contactar contigo, en caso de que sea necesario.
            
• ¿Con que finalidades vamos a tratar sus datos personales?

- Contestar a tus consultas, solicitudes o peticiones.
- Gestionar el servicio solicitado, contestar tu solicitud, o tramitar tu petición.
- Información por medios electrónicos, que versen sobre tu solicitud.
- Información comercial o de eventos por medios electrónicos, siempre que exista autorización expresa.
- Realizar análisis y mejoras en la Web, sobre nuestros productos y servicios.
- Mejorar nuestra estrategia comercial.

• ¿Cuál es la legitimación para el tratamiento de tus datos?

La aceptación y consentimiento del interesado: En aquellos casos donde para realizar una solicitud sea necesario cumplimentar un formulario y hacer un 'click' en el botón de enviar, la realización del mismo implicará necesariamente que ha sido informado y ha otorgado expresamente su consentimiento al contenido de la cláusula anexada a dicho formulario o aceptación de la política de privacidad. Todos nuestros formularios cuentan con el símbolo * en los datos obligatorios. Si no facilitas esos campos, o no marcas el checkbox de aceptación de la política de privacidad, no se permitirá el envío de la información. Normalmente tiene la siguiente fórmula: “□ Soy mayor de 14 y he leído y acepto la Política de privacidad."
            />
            <v-divider class="divider"></v-divider>
            
            <PolicyComponent
            title="Clientes"
            content="•¿Con que finalidades vamos a tratar tus datos personales?

- Elaboración del presupuesto y seguimiento del mismo mediante comunicaciones entre ambas partes.
- Información por medios electrónicos, que versen sobre tu solicitud.
- Información comercial o de eventos por medios electrónicos, siempre que exista autorización expresa.
- Gestionar los servicios administrativos, de comunicaciones y de logística realizados por el Responsable.
- Facturación y declaración de los impuestos oportunos.
- Realizar las transacciones que correspondan.
- Gestiones de control y recobro."
            />
            <v-divider class="divider"></v-divider>
            
            <PolicyComponent
            title="Proveedores"
            content="• ¿Con que finalidades vamos a tratar tus datos personales?

- Información por medios electrónicos, que versen sobre tu solicitud.
- Información comercial o de eventos por medios electrónicos, siempre que exista autorización expresa.
- Gestionar los servicios administrativos, de comunicaciones y de logística realizados por el Responsable.
- Facturación.
- Realizar las transacciones que correspondan.
- Facturación y declaración de los impuestos oportunos.
- Gestiones de control y recobro.
            
• ¿Cuál es la legitimación para el tratamiento de tus datos?

La base legal es la aceptación de una relación contractual, o en su defecto tu consentimiento al contactar con nosotros u ofrecernos sus productos por alguna vía."
            />
            <v-divider class="divider"></v-divider>
            
            <PolicyComponent
            title="Contactos redes sociales"
            content="• ¿Con que finalidades vamos a tratar tus datos personales?

-  Contestar a tus consultas, solicitudes o peticiones.
-  Gestionar el servicio solicitado, contestar tu solicitud, o tramitar tu petición.
- Relacionarnos contigo y crear una comunidad de seguidores.
            
• ¿Cuál es la legitimación para el tratamiento de tus datos?

La aceptación de una relación contractual en el entorno de la red social que corresponda, y conforme a sus políticas de Privacidad:

Facebook: http://www.facebook.com/policy.php?ref=pf
Instragram: https://help.instagram.com/155833707900388
Twitter: http://twitter.com/privacy
Linkedin: http://www.linkedin.com/legal/privacy-policy?trk=hb_ft_priv
Pinterest: https://about.pinterest.com/es/privacy-policy
Youtube: http://www.google.com/intl/es/policies/privacy/

• ¿Durante cuánto tiempo vamos a mantener los datos personales?

Sólo podemos consultar o dar de baja tus datos de forma restringida al tener un perfil específico. Los trataremos tanto tiempo como tu nos dejes siguiéndonos, siendo amigos o dándole a “me gusta”, “seguir” o botones similares. Cualquier rectificación de tus datos o restricción de información o de publicaciones debes realizarla a través de la configuración de tu perfil o usuario en la propia red social."
            />
            <v-divider class="divider"></v-divider>
            
            <PolicyComponent
            title="Demandantes de empleo"
            content="• ¿Con que finalidades vamos a tratar tus datos personales?

- Organización de procesos de selección para la contratación de empleados.
- Citarte para entrevistas de trabajo y evaluar tu candidatura.
            
Si nos has dado tu consentimiento, se lo podremos ceder a empresas colaboradoras o afines, con el único objetivo de ayudarte a encontrar empleo.
- Si marcas el checkbox de aceptación de la política de privacidad, nos das tu consentimiento para ceder tu solicitud de empleo a las entidades que componen el grupo de empresas con el objetivo de incluirte en sus procesos de selección de personal

Asimismo, te comunicamos que transcurrido un año desde la recepción de tu currículum vitae, procederemos a su destrucción segura.

• ¿Cuál es la legitimación para el tratamiento de tus datos?

La base legal es tu consentimiento inequívoco, al enviarnos tu CV."
            />
            <v-divider class="divider"></v-divider>
            
            <PolicyComponent
            title="Videovigilancia"
            content="• ¿Con que finalidades vamos a tratar tus datos personales?
            
- Garantizar la seguridad y el acceso a las instalaciones.
- Control del trabajo de los empleados y demás personal análogo.
- Evaluar la calidad del Servicio.
  
• ¿Cuál es la legitimación para el tratamiento de tus datos?

Proteger interés público

• ¿A quien podremos comunicar tus datos personales?

Los cuerpos y fuerzas de seguridad del estado, y/o los jueces y tribunales:

- En casos de comisión de actos delictivos, verificación de faltas graves, y situaciones análogas.
- Para ejercitar acciones legítimas en base al derecho a nuestra tutela judicial efectiva.
            
• ¿Durante cuanto tiempo vamos a almacenar tus datos personales?

Como máximo, durante un periodo de 30 días.

• ¿Incluimos datos personales de terceras personas?

No, como norma general sólo tratamos los datos que nos facilitan los titulares. Si nos aportas datos de terceros, deberás con carácter previo, informar y solicitar su consentimiento a dichas personas, o de lo contrario nos eximes de cualquier responsabilidad por el incumplimiento de éste requisito.

• ¿Y datos de menores?

No tratamos datos de menores de 14 años. Por tanto, absténgase de facilitarlos si no tiene esa edad o, en su caso, de facilitar datos de terceros que no tengan la citada edad. CAMPING DE BAÑUGUES, S.L. se exime de cualquier responsabilidad por el incumplimiento de esta previsión.

• ¿Realizaremos comunicaciones por medios electrónicos?

- Sólo se realizarán para gestionar tu solicitud, si es uno de los medios de contacto que nos ha facilitado.
- Si realizamos comunicaciones comerciales habrán sido previa y expresamente autorizadas por tí.
            
• ¿Qué medidas de seguridad aplicamos?

Puedes estar tranquilo: Hemos adoptado un nivel óptimo de protección de los Datos Personales que manejamos, y hemos instalado todos los medios y medidas técnicas a nuestra disposición según el estado de la tecnología para evitar la pérdida, mal uso, alteración, acceso no autorizado y robo de los Datos Personales.

• ¿A qué destinatarios se comunicarán tus datos?

Tus datos no se cederán a terceros, salvo obligación legal. En concreto se comunicarán a la Agencia Estatal de la Administración Tributaria y a bancos y entidades financieras para el cobro del servicio prestado o producto adquirido Como a los encargados del tratamiento necesarios para la ejecución del acuerdo. En caso de compra o pago, si eliges alguna aplicación, web, plataforma, tarjeta bancaria, o algún otro servicio online, tus datos se cederán a esa plataforma o se tratarán en su entorno, siempre con la máxima seguridad. Cuando se lo ordenemos, tendrán acceso a nuestra web la empresa de desarrollo y mantenimiento web, o la de hosting. Las mismas tendrán firmado un contrato de prestación de servicios que les obliga a mantener el mismo nivel de privacidad que nosotros.

• ¿Qué Derechos tienes?

- A saber si estamos tratando tus datos o no.
- A acceder a tus datos personales.
- A solicitar la rectificación de tus datos si son inexactos.
- A solicitar la supresión de tus datos si ya no son necesarios para los fines para los que fueron recogidos o si nos retiras el consentimiento otorgado.
- A solicitar la limitación del tratamiento de sus datos, en algunos supuestos, en cuyo caso sólo los conservaremos de acuerdo con la normativa vigente.
- A portar tus datos, que te serán facilitados en un formato estructurado, de uso común o lectura mecánica. Si lo prefieres, se los podemos enviar al nuevo responsable que nos designes. Sólo es válido en determinados supuestos.
- A presentar una reclamación ante la Agencia Española de Protección de Datos o autoridad de control competente, si crees que no te hemos atendido correctamente.
- A revocar el consentimiento para cualquier tratamiento para el que hayas consentido, en cualquier momento.

Si modificas algún dato, te agradecemos que nos lo comuniques para mantenerlos actualizados.

• ¿Quieres un formulario para el ejercicio de Derechos?

- Tenemos formularios para el ejercicio de tus derechos, pídenoslos por email o si lo prefieres, puedes usar los elaborados por la Agencia Española de Protección de Datos o terceros.
- Estos formularios deben ir firmados electrónicamente o ser acompañados de fotocopia del DNI.
- Si te representa alguien, debes adjuntarnos copia de su DNI, o que lo firme con su firma electrónica.
- Los formularios pueden ser presentados presencialmente, enviados por carta o por mail en la dirección del Responsable al inicio de este texto.
            
• ¿Cuánto tardamos en contestarte al Ejercicio de Derechos?

Depende del derecho, pero como máximo en un mes desde tu solicitud, y dos meses si el tema es muy complejo y te notificamos que necesitamos más tiempo.

• ¿Tratamos cookies?

Si usamos otro tipo de cookies que no sean las necesarias, podrás consultar la política de cookies en el enlace correspondiente desde el inicio de nuestra web.

• ¿Durante cuánto tiempo vamos a mantener tus datos personales?

- Los datos personales serán mantenidos mientras sigas vinculado con nosotros.
- Una vez te desvincules, los datos personales tratados en cada finalidad se mantendrán durante los plazos legalmente previstos, incluído el plazo en el que un juez o tribunal los pueda requerir atendiendo al plazo de prescripción de acciones judiciales.
- Los datos tratados se mantendrán en tanto no expiren los plazos legales aludidos anteriormente, si hubiera obligación legal de mantenimiento, o de no existir ese plazo legal, hasta que el interesado solicite su supresión o revoque el consentimiento otorgado.
- Mantendremos toda la información y comunicaciones relativas a tu compra o a la prestación de nuestro servicio, mientras duren las garantías de los productos o servicios, para atender posibles reclamaciones."
            />         
        </v-card-text>
      </v-card>
    </v-dialog>
 
</template>