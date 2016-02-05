package se.lewdcode;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.ShellAdapter;
import org.eclipse.swt.events.ShellEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Main {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Main window = new Main();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell(SWT.CLOSE | SWT.TITLE | SWT.BORDER |
				SWT.APPLICATION_MODAL | SWT.MIN);
		
		Button button = new Button(shell, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		button.setBounds(0, 0, 33, 57);
		button.setText("<");
		
		Browser web = new Browser(shell, SWT.NONE);
		web.setBounds(0, 0, 1149, 621);
		
		Button ph = new Button(shell, SWT.NONE);
		ph.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				web.setUrl("http://pornhub.com");
			}
		});
		Button red = new Button(shell, SWT.NONE);
		red.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				web.setUrl("http://redtube.com");
			}
		});
		Button yp = new Button(shell, SWT.NONE);
		yp.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				web.setUrl("http://youporn.com");
			}
		});
		Button xnxx = new Button(shell, SWT.NONE);
		xnxx.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				web.setUrl("http://xnxx.com");
			}
		});
		Button mless = new Button(shell, SWT.NONE);
		mless.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				web.setUrl("http://motherless.com");
			}
		});
		Button xvid = new Button(shell, SWT.NONE);
		xvid.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				web.setUrl("http://xvideos.com");
			}
		});
		Button xham = new Button(shell, SWT.NONE);
		xham.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				web.setUrl("http://xhamster.com");
			}
		});
		Button tk = new Button(shell, SWT.NONE);
		tk.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				web.setUrl("http://tubekitty.com");
			}
		});
		Button t8 = new Button(shell, SWT.NONE);
		t8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				web.setUrl("http://tube8.com");
			}
		});
		Button sw = new Button(shell, SWT.NONE);
		sw.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				web.setUrl("http://spankwire.com");
			}
		});
		Button et = new Button(shell, SWT.NONE);
		et.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				web.setUrl("http://extremetube.com");
			}
		});
		Button ms = new Button(shell, SWT.NONE);
		ms.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				web.setUrl("http://mofosex.com");
			}
		});
		Button xt = new Button(shell, SWT.NONE);
		xt.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				web.setUrl("http://xtube.com");
			}
		});
		Button mfc = new Button(shell, SWT.NONE);
		mfc.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				web.setUrl("http://myfreecams.com");
			}
		});
		Button cb = new Button(shell, SWT.NONE);
		cb.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				web.setUrl("http://chaturbate.com");
			}
		});
		Button pg = new Button(shell, SWT.NONE);
		pg.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				web.setUrl("http://perfectgirls.net");
			}
		});
		Button fb = new Button(shell, SWT.NONE);
		fb.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				web.setUrl("http://fetishbox.com");
			}
		});
		Button ef = new Button(shell, SWT.NONE);
		ef.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				web.setUrl("http://efukt.com");
			}
		});
		Button cam = new Button(shell, SWT.NONE);
		cam.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				web.setUrl("http://cams.com");
			}
		});
		Button jas = new Button(shell, SWT.NONE);
		jas.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				web.setUrl("http://livejasmin.com");
			}
		});
		String reddit = "http://reddit.com/r/";
		Button gone = new Button(shell, SWT.NONE);
		gone.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				web.setUrl(reddit + "GoneWild");
			}
		});
		Button nsfw = new Button(shell, SWT.NONE);
		nsfw.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				web.setUrl(reddit + "NSFW");
			}
		});
		Button rg = new Button(shell, SWT.NONE);
		rg.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				web.setUrl(reddit + "RealGirls");
			}
		});
		Button lt = new Button(shell, SWT.NONE);
		lt.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				web.setUrl(reddit + "LegalTeens");
			}
		});
		Button giyp = new Button(shell, SWT.NONE);
		giyp.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				web.setUrl(reddit + "GirlsInYogaPants");
			}
		});
		Button fdau = new Button(shell, SWT.NONE);
		fdau.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				web.setUrl(reddit + "FaceDownAssUp");
			}
		});
		Button ass = new Button(shell, SWT.NONE);
		ass.addSelectionListener(new SelectionAdapter(){
			@Override
			public void widgetSelected(SelectionEvent e){
				web.setUrl(reddit + "Ass");
			}
		});
		Button up = new Button(shell, SWT.NONE);
		up.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				web.setUrl(reddit + "upskirt");
			}
		});
		
		//shell = new Shell(SWT.CLOSE | SWT.TITLE | SWT.BORDER |
			//	SWT.APPLICATION_MODAL | SWT.MIN);
		shell.addShellListener(new ShellAdapter() {
			@Override
			public void shellActivated(ShellEvent e) {
				ph.setVisible(false);
				red.setVisible(false);
				yp.setVisible(false);
				xnxx.setVisible(false);
				mless.setVisible(false);
				xvid.setVisible(false);
				xham.setVisible(false);
				tk.setVisible(false);
				t8.setVisible(false);
				sw.setVisible(false);
				et.setVisible(false);
				ms.setVisible(false);
				xt.setVisible(false);
				mfc.setVisible(false);
				cb.setVisible(false);
				pg.setVisible(false);
				fb.setVisible(false);
				ef.setVisible(false);
				cam.setVisible(false);
				jas.setVisible(false);
				gone.setVisible(false);
				nsfw.setVisible(false);
				rg.setVisible(false);
				lt.setVisible(false);
				giyp.setVisible(false);
				fdau.setVisible(false);
				ass.setVisible(false);
				up.setVisible(false);
			}
		});
		shell.setSize(1300, 650);
		shell.setText("Cum N Go | The #1 Fap Focused Browser");
		
		//Button ph = new Button(shell, SWT.NONE);
		ph.setBounds(1155, 50, 60, 25);
		ph.setText("PornHub");
		
		//Button red = new Button(shell, SWT.NONE);
		red.setBounds(1224, 50, 60, 25);
		red.setText("RedTube");
		
		//Button yp = new Button(shell, SWT.NONE);
		yp.setBounds(1155, 81, 60, 25);
		yp.setText("YouPorn");
		
		//Button xnxx = new Button(shell, SWT.NONE);
		xnxx.setBounds(1224, 81, 60, 25);
		xnxx.setText("XNXX");
		
		//Button mless = new Button(shell, SWT.NONE);
		mless.setBounds(1155, 112, 129, 25);
		mless.setText("Motherless");
		
		//Button xvid = new Button(shell, SWT.NONE);
		xvid.setBounds(1155, 143, 60, 25);
		xvid.setText("XVideos");
		
		//Button xham = new Button(shell, SWT.NONE);
		xham.setBounds(1224, 143, 60, 25);
		xham.setText("XHamster");
		
		Label label = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setBounds(1151, 41, 143, 2);
		
		//Button tk = new Button(shell, SWT.NONE);
		tk.setBounds(1155, 174, 60, 25);
		tk.setText("TubeKitty");
		
		//Button t8 = new Button(shell, SWT.NONE);
		t8.setBounds(1224, 174, 60, 25);
		t8.setText("Tube8");
		
		//Button sw = new Button(shell, SWT.NONE);
		sw.setBounds(1155, 205, 129, 25);
		sw.setText("SpankWire");
		
		//Button et = new Button(shell, SWT.NONE);
		et.setBounds(1155, 236, 129, 25);
		et.setText("ExtremeTube");
		
		//Button ms = new Button(shell, SWT.NONE);
		ms.setBounds(1155, 267, 60, 25);
		ms.setText("MofoSex");
		
		//Button xt = new Button(shell, SWT.NONE);
		xt.setBounds(1224, 267, 60, 25);
		xt.setText("XTube");
		
		Label label_1 = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_1.setBounds(1151, 365, 143, 2);
		
		//Button mfc = new Button(shell, SWT.NONE);
		mfc.setBounds(1155, 373, 60, 25);
		mfc.setText("MFC");
		//Button mfc = new Button(shell, SWT.NONE);
		//Button cb = new Button(shell, SWT.NONE);
		cb.setBounds(1224, 373, 63, 25);
		cb.setText("Chaturbate");
		
		//Button pg = new Button(shell, SWT.NONE);
		pg.setBounds(1155, 298, 129, 25);
		pg.setText("Perfect Girls");
		
		//Button fb = new Button(shell, SWT.NONE);
		fb.setBounds(1155, 329, 60, 25);
		fb.setText("FetishBox");
		
		//Button ef = new Button(shell, SWT.NONE);
		ef.setBounds(1221, 329, 63, 25);
		ef.setText("eFukt");
		
		//Button cam = new Button(shell, SWT.NONE);
		cam.setBounds(1155, 404, 60, 25);
		cam.setText("Cams");
		
		//Button jas = new Button(shell, SWT.NONE);
		jas.setBounds(1224, 404, 60, 25);
		jas.setText("Jasmin");
		
		Label label_2 = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_2.setBounds(1151, 435, 143, 2);
		
		Label lblRedditSites = new Label(shell, SWT.NONE);
		lblRedditSites.setBounds(1155, 443, 129, 15);
		lblRedditSites.setText("Reddit Sites");
		
		
		gone.setBounds(1155, 464, 63, 25);
		gone.setText("GoneWild");
		
		//Button nsfw = new Button(shell, SWT.NONE);
		nsfw.setBounds(1224, 464, 60, 25);
		nsfw.setText("NSFW GIF");
		
		//Button rg = new Button(shell, SWT.NONE);
		rg.setBounds(1155, 492, 63, 25);
		rg.setText("RealGirls");
		
		//Button lt = new Button(shell, SWT.NONE);
		lt.setBounds(1224, 492, 70, 25);
		lt.setText("LegalTeens");
		
		//Button giyp = new Button(shell, SWT.NONE);
		giyp.setBounds(1155, 523, 129, 25);
		giyp.setText("GirlsInYogaPants");
		
		//Button fdau = new Button(shell, SWT.NONE);
		fdau.setBounds(1155, 551, 129, 25);
		fdau.setText("FaceDownAssUp");
		
		//Button ass = new Button(shell, SWT.NONE);
		ass.setBounds(1155, 586, 63, 25);
		ass.setText("Ass");
		
		//Button up = new Button(shell, SWT.NONE);
		up.setBounds(1224, 586, 60, 25);
		up.setText("Upskirt");
		
		Button getStarted = new Button(shell, SWT.NONE);
		getStarted.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				MessageDialog.openInformation(shell, "Welcome!", "To go to a site, click the corresponding button. \r\n\r\nIf you would like to suggest a site, or report an issue, send a Direct Message to @LewdCode");
				ph.setVisible(true);
				red.setVisible(true);
				yp.setVisible(true);
				xnxx.setVisible(true);
				mless.setVisible(true);
				xvid.setVisible(true);
				xham.setVisible(true);
				tk.setVisible(true);
				t8.setVisible(true);
				sw.setVisible(true);
				et.setVisible(true);
				ms.setVisible(true);
				xt.setVisible(true);
				mfc.setVisible(true);
				cb.setVisible(true);
				pg.setVisible(true);
				fb.setVisible(true);
				ef.setVisible(true);
				cam.setVisible(true);
				jas.setVisible(true);
				gone.setVisible(true);
				nsfw.setVisible(true);
				rg.setVisible(true);
				lt.setVisible(true);
				giyp.setVisible(true);
				fdau.setVisible(true);
				ass.setVisible(true);
				up.setVisible(true);
			}
		});
		getStarted.setBounds(1155, 10, 129, 25);
		getStarted.setText("Get Started!");
		

	}

	private void history() {
		// TODO Auto-generated method stub
		
	}
}
