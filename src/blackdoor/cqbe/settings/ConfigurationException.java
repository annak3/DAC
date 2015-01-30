package blackdoor.cqbe.settings;

/**
 * 
 * @author Cj Buresch
 * @version v0.0.1 - Jan 20, 2015
 */
public class ConfigurationException extends RuntimeException {

	public ConfigurationException() {
		super();
	}

	public ConfigurationException(String e) {
		super(e);
	}

	public ConfigurationException(Throwable e) {
		super(e);
	}

	public static class SettingNotFoundException extends ConfigurationException {
		public SettingNotFoundException() {
			super();
		}
	}

	public static class SettingFormatException extends ConfigurationException {
		public SettingFormatException() {
			super();
		}
	}

	public static class SettingSaveException extends ConfigurationException {
		public SettingSaveException() {
			super();
		}

	}
}
