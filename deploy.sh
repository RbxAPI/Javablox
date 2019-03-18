#!/usr/bin/env bash
echo $mavenUser
echo ${mavenUser}
if [ "$TRAVIS_BRANCH" = 'master' ] && [ "$TRAVIS_PULL_REQUEST" == 'false' ]; then
  ./gradlew publish -PossrhUsername=${mavenUser} -PossrhPassword=${mavenPassword} -Psigning.keyId=${GPG_KEY_ID} -Psigning.password=${GPG_KEY_PASSPHRASE} -Psigning.secretKeyRingFile=travis.gpg
fi