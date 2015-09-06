from Duck import *
from CallBehavior import *
from CreakBehavior import *
from QuackBehavior import *

d1 = Duck()
d2 = Duck()
d2.setCallBehavior(CreakBehavior())
d1.setCallBehavior(QuackBehavior())

d1.call()
d2.call()

