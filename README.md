# Morphé Common

Shared core utilities and abstractions used across the Morphé ecosystem.

## Overview

`morphe-common` provides foundational shared components used by multiple Morphé projects.

This module exists to centralize truly common functionality and avoid unnecessary coupling between independent systems such as:

- Morphé VM
- Morphé Language
- Morphé API
- Morphé IDE

The project is intentionally lightweight and focused on cross-module contracts.

---

## Current Features

### Exception System

#### `MorpheException`

Base unchecked exception for all Morphé-related errors.

This class acts as the root exception type shared across the entire ecosystem.

Example hierarchy:

```text
MorpheException
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
    implementation 'dev.eidos:morphe-common:1.0.0'
}
```
---
## Philosophy

`morphe-common` should remain minimal.

Only abstractions genuinely shared across multiple Morphé modules belong here.

Examples include:

- shared exceptions
- source metadata structures
- diagnostics
- common utility contracts

Runtime-specific or language-specific logic should remain in their respective projects.

---

## Part of the Morphé Ecosystem

- Morphé Common
- Morphé VM
- Morphé Language
- Morphé API
- Morphé IDE