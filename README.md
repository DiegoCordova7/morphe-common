# Eidos Common

Shared core utilities and abstractions used across the Eidos ecosystem.

## Overview

`eidos-common` provides foundational shared components used by multiple Eidos projects.

This module exists to centralize truly common functionality and avoid unnecessary coupling between independent systems such as:

- Eidos VM
- Eidos Language
- Eidos API
- Eidos IDE

The project is intentionally lightweight and focused on cross-module contracts.

---

## Current Features

### Exception System

#### `EidosException`

Base unchecked exception for all Eidos-related errors.

This class acts as the root exception type shared across the entire ecosystem.

Example hierarchy:

```text
EidosException
├── VMException
├── LangException
│   ├── LexerException
│   ├── ParseException
│   └── SemanticException
└── APIException
```

This unified model simplifies:

- error propagation
- tooling integration
- diagnostics
- IDE support
- centralized error handling

## Requirements
Java 17+

## Build

```bash
./gradlew build
```

## Publish to Maven Local

```bash
./gradlew publishToMavenLocal
```

### Usage

Gradle dependency:

```gradle
dependencies {
    implementation 'dev.eidos:eidos-common:1.0.0'
}
```
---
## Philosophy

`eidos-common` should remain minimal.

Only abstractions genuinely shared across multiple Eidos modules belong here.

Examples include:

- shared exceptions
- source metadata structures
- diagnostics
- common utility contracts

Runtime-specific or language-specific logic should remain in their respective projects.

---

## Part of the Eidos Ecosystem

- Eidos Common
- Eidos VM
- Eidos Language
- Eidos API
- Eidos IDE