#!/usr/bin/env bash
echo $mavenUser
echo ${mavenUser}
if [ "$TRAVIS_BRANCH" = 'master' ] && [ "$TRAVIS_PULL_REQUEST" == 'false' ]; then
  openssl aes-256-cbc -K $encrypted_b8b4d31050a3_key -iv $encrypted_b8b4d31050a3_iv -in travis.gpg.enc -out travis.gpg -d
  ./gradlew publish -PossrhUsername=${mavenUser} -PossrhPassword=${mavenPassword} -Psigning.keyId=${GPG_KEY_ID} -Psigning.password=${GPG_KEY_PASSPHRASE} -Psigning.secretKeyRingFile=travis.gpg
fi