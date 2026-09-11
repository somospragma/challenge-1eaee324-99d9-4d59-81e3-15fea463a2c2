# Análisis de Vulnerabilidad en Arquitecturas Distribuidas

En el contexto de sistemas integrados y arquitecturas distribuidas, la seguridad es un aspecto crítico. Este reto se enfoca en entender y explicar los mecanismos de seguridad, como las listas de control de acceso (ACL), las auditorías de seguridad y cómo abordar los riesgos en sistemas distribuidos y microservicios.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Analisis de vulnerabilidad |
| **Nivel** | advanced-l2 |
| **Tipo** | theoretical |
| **Tiempo estimado** | 2-3 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Comprensión de Listas de Control de Acceso (ACL)

**Objetivo:** Entender el propósito y funcionamiento de las ACL en sistemas seguros.

**Tiempo estimado:** 45 minutos

**Instrucciones:**

- Investiga y explica el propósito de las listas de control de acceso en el contexto de la seguridad de sistemas distribuidos.
- Identifica cómo las ACL pueden ser utilizadas para mejorar la seguridad en arquitecturas de microservicios.

**Entregable:** Un documento que explique el propósito y uso de las ACL en sistemas distribuidos.

<details>
<summary>Pistas de conocimiento</summary>

- Considera los diferentes niveles de acceso y cómo las ACL pueden aplicar restricciones específicas.
- Piensa en los beneficios y limitaciones de usar ACL en un entorno de microservicios.

</details>

### Fase 2: Rol de las Auditorías de Seguridad

**Objetivo:** Evaluar la importancia y el impacto de las auditorías de seguridad en el ciclo de vida del desarrollo de software.

**Tiempo estimado:** 45 minutos

**Instrucciones:**

- Analiza el papel de las auditorías de seguridad en diferentes etapas del ciclo de vida del desarrollo de software.
- Discute cómo las auditorías pueden identificar y mitigar vulnerabilidades en sistemas distribuidos.

**Entregable:** Un informe que detalle el papel y la importancia de las auditorías de seguridad en el desarrollo de software.

<details>
<summary>Pistas de conocimiento</summary>

- Considera las diferentes metodologías y enfoques para realizar auditorías de seguridad.
- Evalúa cómo las auditorías pueden influir en la toma de decisiones de diseño y desarrollo.

</details>

### Fase 3: Abordar Riesgos de Seguridad en Sistemas Distribuidos

**Objetivo:** Proponer estrategias para abordar y mitigar riesgos de seguridad en sistemas distribuidos y microservicios.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identifica los principales riesgos de seguridad en sistemas distribuidos y microservicios.
- Propón estrategias y prácticas para mitigar estos riesgos, considerando trade-offs y decisiones de diseño.

**Entregable:** Un documento que detalle estrategias y prácticas para abordar riesgos de seguridad en sistemas distribuidos y microservicios.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la interoperabilidad y la comunicación segura entre microservicios.
- Evalúa los trade-offs entre seguridad y rendimiento en sistemas distribuidos.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son las listas de control de acceso (ACL) y cuál es su propósito en sistemas distribuidos?
- **paraQueSirve**: ¿Cuál es el papel de las auditorías de seguridad en el ciclo de vida del desarrollo de software?
- **comoSeUsa**: ¿Cómo se pueden implementar estrategias de seguridad en sistemas distribuidos y microservicios?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar listas de control de acceso en sistemas distribuidos?
- **queDecisionesImplica**: ¿Qué decisiones de diseño deben considerarse al abordar riesgos de seguridad en sistemas distribuidos?

## Criterios de Evaluacion

- Explicar el propósito y uso de las listas de control de acceso en sistemas distribuidos.
- Evaluar la importancia y el impacto de las auditorías de seguridad en el ciclo de vida del desarrollo de software.
- Proponer estrategias y prácticas para mitigar riesgos de seguridad en sistemas distribuidos y microservicios.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
