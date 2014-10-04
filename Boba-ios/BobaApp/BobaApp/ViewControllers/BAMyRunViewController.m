//
//  BAMyRunViewController.m
//  BobaApp
//
//  Created by Hyun Bin Kim on 2014-10-04.
//  Copyright (c) 2014 coursera interns. All rights reserved.
//

#import "BAMyRunViewController.h"
#import "Helpers.h"

@class BARestaurantSearchViewController;

@implementation BAMyRunViewController

- (IBAction)startRunButtonPressed:(id)sender {
    UIStoryboard *mainStoryboard = [Helpers getMainStoryboard];
    BARestaurantSearchViewController *restaurantSearchViewController = [mainStoryboard instantiateViewControllerWithIdentifier:@"BARestaurantSearchViewController"];
    [self.navigationController pushViewController:(UIViewController *)restaurantSearchViewController animated:YES];
}

@end
