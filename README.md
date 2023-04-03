# LV-223 Colonization Simulation Project

## Introduction

Welcome to my LV-223 Colonization Simulation project, which is part of my school project where I will be applying my
knowledge of multi agent systems, fuzzy logic, and search algorithms to simulate the preparation phase for a human
colonization on a potentially habitable planet.

### Project Description

The planet LV-223 was thought to be suitable for a human colony, and a robotic exploration ship was sent in 2093 to
prepare for the arrival of human colonists eight years later. The goal of this project is to create an application that
simulates the preparation phase for the upcoming human colonization. However, LV-223 turns out to be less hospitable
than anticipated. Can your robots secure the base and its environment before the colonists arrive?

### Project Requirements

To accomplish this project, you will need to apply knowledge from class:

* Solid understanding of multi agent systems, fuzzy logic, and search algorithms
* Proficiency in Java
* Problem-solving skills
* Critical thinking skills
* Creativity

### Instructions

#### Planet description

LV-223 is a shape-shifting planet whose atmosphere is similar to Earth's and has a climate cycle equivalent to that of
Earth. It has a variety of plant life, including edible fruits and vegetables, as well as embryonic animal life, such as
lumbricina in loose soil and various pollinating insects. The planet has several types of terrain, as shown in Figure 1,
which depicts its state at the start of the simulation. The planet can be considered a "reactive" agent with a mechanism
for storing the metamorphoses it undergoes, as well as a health state associated with the quantity and duration of the
metamorphoses.

LV-223 is a planet with a quasi-rigid exoskeleton core, where regions of the planet containing ore, impermeable terrain,
and the bottoms of lakes and ponds connect to the exoskeleton core. Any extraction of ore or water from these regions
can destabilize the planet's exoskeleton and cause metamorphoses to occur. Our project focuses on simulating these
changes using fuzzy logic.

#### Extraction of Ore

The percentage of ore extracted from a region determines the degree of destabilization caused to the planet's
exoskeleton. We consider extraction levels as small, medium, or large based on the percentage of ore extracted from a
region. The membership function in figure 2 describes these levels using trapezoidal curves. Our simulation allows the
use of bell curves instead for smoother results.

#### Extraction of Water

Similarly, the amount of water drawn from the bottoms of lakes and ponds can also cause destabilization. We consider the
amount of water drawn as insignificant, small, medium, or large, depending on the volume of water taken from a region.
Figure 3 shows the membership function for water extraction levels using trapezoidal curves.

#### Metamorphoses

Extraction of ore or water causes an amplitude A and velocity v wave to propagate from the point of origin throughout
the exoskeleton. When the wave reaches the border of the exoskeleton, the border reflects the wave back into the
surrounding metamorphosable regions. The metamorphosable regions within a distance d from the point of origin are
affected, where d = A × v. However, not all of the metamorphosable regions within the affected distance will undergo
metamorphosis. The percentage of metamorphosis in each region can be limited, small, medium, large, or important. Figure
4 shows the membership function for metamorphosis levels using trapezoidal curves. Again, our simulation can use bell
curves instead for better results.

### Colony

This is a simulation of 13 exploration robots on the planet LV-223, where they initially have no knowledge of the
surrounding terrain or the planet's metamorphic capabilities. Over time, the robots discover the planet and report their
findings to a central agent called "Centralisateur" or central agent.

The robots include three miners, three pipeline builders, three food gatherers, two farmers, and two cartographers.

#### Cartographer

The cartographer is an autonomous drone that maps the planet and reports the type of terrain it flies over to the
central agent. The cartographer has no prior knowledge of the planet's metamorphic capabilities and develops strategies
to map the planet efficiently.

#### Miner

The miner's goal is to collect various minerals, from the planet and bring
them back to the base. The miner does not have a map of the area but is equipped with detectors that identify the
presence of minerals on the current location. The miner notifies the central agent of the location of minerals and
places a marker on the ground to indicate that the area is being mined.

#### Food Gatherer

The food gatherer's objective is to collect food and bring it back to the base. Like the miner, the food gatherer does
not have a map of the area but is equipped with detectors that identify the presence of food on the current location.
The food gatherer notifies the central agent of the location of food and places a marker on the ground to indicate that
the area is being harvested.

#### Pipeline Builder

The pipeline builder's goal is to construct a pipeline between a water source and the base and maintain it. The pipeline
must follow the shortest path between the lake or pond and the base. Once connected, the pipeline ensures a steady
supply of water to the base.

#### Central Agent

The central agent collects data from the robots, including resources collected by the miners and food gatherers, water
supply, and consumption. The agent also maps the planet's resources and pipeline network.

## Project Deliverables

Please refer to the following sections for more information about the project deliverables.

### Setup of the project

- [x] [Issue : Redacting readme](https://github.com/LEBOCQTitouan/ia-ensicaen-colonisation/issues/24)

### Basic simulation with no agent logic implementation

- [ ] [Issue : App frame component creation](https://github.com/LEBOCQTitouan/ia-ensicaen-colonisation/issues/2)
- [ ] [Issue : Base model implementation](https://github.com/LEBOCQTitouan/ia-ensicaen-colonisation/issues/3)
- [ ] [Issue : Introduction of commands to the model](https://github.com/LEBOCQTitouan/ia-ensicaen-colonisation/issues/4)
- [ ] [Issue : Basic step cycle implementation for sequencer](https://github.com/LEBOCQTitouan/ia-ensicaen-colonisation/issues/5)
- [ ] [Issue : Basic score system implementation for the colony](https://github.com/LEBOCQTitouan/ia-ensicaen-colonisation/issues/6)
- [ ] [Issue : Display planet / colony & score info in view](https://github.com/LEBOCQTitouan/ia-ensicaen-colonisation/issues/7)
- [ ] [Issue : Water pipe logic implementation](https://github.com/LEBOCQTitouan/ia-ensicaen-colonisation/issues/17)
- [ ] [Issue : Shockwave implementation](https://github.com/LEBOCQTitouan/ia-ensicaen-colonisation/issues/18)
- [ ] [Issue : Basic mutation system implementation](https://github.com/LEBOCQTitouan/ia-ensicaen-colonisation/issues/19)
- [ ] [Issue : Colony agent communication setup](https://github.com/LEBOCQTitouan/ia-ensicaen-colonisation/issues/20)
- [ ] [Issue : Conditional display (planet & all robots and robot by robot view)](https://github.com/LEBOCQTitouan/ia-ensicaen-colonisation/issues/21)
- [ ] [Issue : Canvas simulation display](https://github.com/LEBOCQTitouan/ia-ensicaen-colonisation/issues/22)
- [ ] [Issue : Exoskeleton loading](https://github.com/LEBOCQTitouan/ia-ensicaen-colonisation/issues/25)

### Agent logic implementation

- [ ] [Issue : Fuzzy logic implementation](https://github.com/LEBOCQTitouan/ia-ensicaen-colonisation/issues/8)
- [ ] [Issue : A-star implementation](https://github.com/LEBOCQTitouan/ia-ensicaen-colonisation/issues/9)
- [ ] [Issue : Q-learning implementation](https://github.com/LEBOCQTitouan/ia-ensicaen-colonisation/issues/10)
- [ ] [Issue : Scout logic implementation](https://github.com/LEBOCQTitouan/ia-ensicaen-colonisation/issues/11)
- [ ] [Issue : Extractor logic implementation](https://github.com/LEBOCQTitouan/ia-ensicaen-colonisation/issues/12)
- [ ] [Issue : Farmer logic implementation](https://github.com/LEBOCQTitouan/ia-ensicaen-colonisation/issues/13)
- [ ] [Issue : Pipeline builder logic implementation](https://github.com/LEBOCQTitouan/ia-ensicaen-colonisation/issues/14)
- [ ] [Issue : Harvester logic implementation](https://github.com/LEBOCQTitouan/ia-ensicaen-colonisation/issues/15)
- [ ] [Issue : Global agent logic & strategy implementation (centralizer and group logic)](https://github.com/LEBOCQTitouan/ia-ensicaen-colonisation/issues/16)

### Going further than the subject

- [ ] [Issue : Defining possible upgrades](https://github.com/LEBOCQTitouan/ia-ensicaen-colonisation/issues/23)