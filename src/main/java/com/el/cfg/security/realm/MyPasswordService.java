package com.el.cfg.security.realm;

import org.apache.shiro.authc.credential.PasswordService;
import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * Created on 16/7/21.
 *
 * @author panlw
 */
public class MyPasswordService implements PasswordService {

    private static final String HASH_ALGO = "SHA-256";
    private static final String HASH_SALT = "flh884wndkv5rfwc";

    @Override
    public String encryptPassword(Object plaintextPassword) throws IllegalArgumentException {
        return new SimpleHash(HASH_ALGO, plaintextPassword, HASH_SALT).toHex();
    }

    @Override
    public boolean passwordsMatch(Object submittedPlaintext, String encrypted) {
        return encryptPassword(submittedPlaintext).equals(encrypted);
    }
}
