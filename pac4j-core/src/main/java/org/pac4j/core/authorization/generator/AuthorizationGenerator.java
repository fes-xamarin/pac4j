package org.pac4j.core.authorization.generator;

import org.pac4j.core.profile.CommonProfile;

/**
 * Generate the authorization roles and permissions for this user profile.
 * 
 * @author Jerome Leleu
 * @since 1.5.0
 */
public interface AuthorizationGenerator<U extends CommonProfile> {

    /**
     * Generate the authorization information from and for the user profile.
     * 
     * @param profile the user profile for which to generate the authorization information.
     */
    void generate(U profile);
}
