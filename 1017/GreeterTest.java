import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GreeterTest {

	private final Account japan = new Account("hanakoSUZUKI", Country.valueOf("JAPAN"));
	private final Greeter greeterJapan = GreeterFactory.getGreeter(japan);
	private final Account germany = new Account("hanakoSUZUKI", Country.valueOf("GERMANY"));
	private final Greeter greeterGermany = GreeterFactory.getGreeter(germany);
	private final Account france = new Account("hanakoSUZUKI", Country.valueOf("FRANCE"));
	private final Greeter greeterFrance = GreeterFactory.getGreeter(france);



	@Test
	public void doTestJAPAN_login() {
		assertThat(greeterJapan.login(japan), is("こんにちは、hanakoSUZUKIさん。"));
	}

	@Test
	public void doTestJAPAN_like() {
		assertThat(greeterJapan.like(japan), is("ありがとうございます。"));
	}

	@Test
	public void doTestJAPAN_logout() {
		assertThat(greeterJapan.logout(japan), is("さようなら。"));
  }
	@Test
	public void doTestGERMANY_login() {
		assertThat(greeterGermany.login(germany), is("Guten Tag, hanakoSUZUKI."));
	}

	@Test
	public void doTestGERMANY_like() {
		assertThat(greeterGermany.like(germany), is("Aus Wiedersehen."));
	}

	@Test
	public void doTestGERMANY_logout() {
		assertThat(greeterGermany.logout(germany), is(""));
  }
	@Test
	public void doTestFRANCE_login() {
		assertThat(greeterFrance.login(france), is("hanakoSUZUKI."));
	}

	@Test
	public void doTestFRANCE_like() {
		assertThat(greeterFrance.like(france), is(""));
	}

	@Test
	public void doTestFRANCE_logout() {
		assertThat(greeterFrance.logout(france), is(""));
  }

}

