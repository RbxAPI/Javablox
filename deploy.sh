#!/usr/bin/env bash
if [ "$TRAVIS_BRANCH" = 'master' ] && [ "$TRAVIS_PULL_REQUEST" == 'false' ]; then
   openssl aes-256-cbc -K $encrypted_1a499bc70cbf_key -iv $encrypted_1a499bc70cbf_iv -in travis.gpg.enc -out travis.gpg -d
  ./gradlew publish -PossrhUsername=${mavenUser} -PossrhPassword=${mavenPassword} -Psigning.keyId=${GPG_KEY_ID} -Psigning.password=${GPG_KEY_PASSPHRASE} -Psigning.secretKeyRingFile=travis.gpg
fi