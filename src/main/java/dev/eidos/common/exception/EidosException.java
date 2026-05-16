package dev.eidos.common.exception;

/**
 * Base exception for all Eidos-related errors.
 *
 * <p>
 * {@code EidosException} represents the root unchecked exception
 * type shared across the Eidos ecosystem, including:
 * </p>
 *
 * <ul>
 *   <li>language frontends</li>
 *   <li>semantic analysis</li>
 *   <li>compilation</li>
 *   <li>virtual machine execution</li>
 *   <li>runtime services and tooling</li>
 * </ul>
 *
 * <p>
 * Specialized exception hierarchies such as VM or language-specific
 * exceptions should extend this class to provide a unified error model
 * across all Eidos modules.
 * </p>
 *
 * <p>
 * This exception extends {@link RuntimeException}, making all Eidos
 * exceptions unchecked by default.
 * </p>
 */
public abstract class EidosException extends RuntimeException {

  /**
   * Creates a new Eidos exception with the given message.
   *
   * @param message the error description
   */
  protected EidosException(String message) {
    super(message);
  }

  /**
   * Creates a new Eidos exception with the given message and root cause.
   *
   * @param message the error description
   * @param cause the original exception cause
   */
  protected EidosException(String message, Throwable cause) {
    super(message, cause);
  }
}