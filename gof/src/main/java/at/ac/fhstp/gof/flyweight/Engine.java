package at.ac.fhstp.gof.flyweight;

import java.util.logging.Logger;

public class Engine {

	/**
	 * Logger.
	 */
	private final static Logger LOG = Logger.getLogger(Engine.class.getName());

	/**
	 * Starts the engine.
	 */
	public void start() {
		LOG.info("Engine is starting!");
	}

	/**
	 * Stops the engine.
	 */
	public void stop() {
		LOG.info("Engine is stopping!");
	}
}
