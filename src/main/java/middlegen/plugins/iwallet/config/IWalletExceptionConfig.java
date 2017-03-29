/*
 * Taobao.com Inc.
 * Copyright (c) 2000-2004 All Rights Reserved.
 */
package middlegen.plugins.iwallet.config;


/**
 * @author Cheng Li
 *
 * @version $Id: IWalletExceptionConfig.java,v 1.1 2004/12/24 07:34:20 baobao Exp $
 */
public class IWalletExceptionConfig extends Exception {
    /**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 3690192148834105400L;

	/**
     * Constructor for IWalletExceptionConfig.
     */
    public IWalletExceptionConfig() {
        super();
    }

    /**
     * Constructor for IWalletExceptionConfig.
     */
    public IWalletExceptionConfig(String message) {
        super(message);
    }

    /**
     * Constructor for IWalletExceptionConfig.
     */
    public IWalletExceptionConfig(Throwable cause) {
        super(cause);
    }

    /**
     * Constructor for IWalletExceptionConfig.
     */
    public IWalletExceptionConfig(String message, Throwable cause) {
        super(message, cause);
    }
}
