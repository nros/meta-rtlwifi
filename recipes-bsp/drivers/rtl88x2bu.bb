SUMMARY = "RTL88x2BU kernel driver (wifi)"
DESCRIPTION = "RTL88x2BU kernel driver (like RTL8812BU)"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ca671256c791bbbf7c985ca88dc89fc9"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
SRCREV = "f0a2c9c74045cf2c3701084f389e358f9236fc8c"
SRC_URI = " \
    git://github.com/morrownr/88x2bu-20210702;protocol=https;branch=master \
    file://0001-use-modules_install-as-wanted-by-yocto.patch \
"
PV = "5.13.1-git"

inherit module
S = "${WORKDIR}/git"
EXTRA_OEMAKE:append = " KSRC=${STAGING_KERNEL_DIR}"
