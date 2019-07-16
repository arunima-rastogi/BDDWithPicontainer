package picocontainerUtilities;

import cucumber.runtime.java.picocontainer.PicoFactory;
import utilities.CSVUtilities;
import utilities.SharedDrive;

public class PicoDependencyInjector extends PicoFactory {

	public PicoDependencyInjector() {
		addClass(CSVUtilities.class);
		addClass(SharedDrive.class);
	}
}